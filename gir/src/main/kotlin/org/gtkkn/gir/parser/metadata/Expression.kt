/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.gir.parser.metadata

import org.gtkkn.gir.ext.compress

/**
 * Base class for all expressions in the source code.
 */
sealed class Expression {
    /**
     * Returns a string representation of the expression.
     */
    abstract override fun toString(): String

    /**
     * Determines if the expression is pure (has no side effects).
     */
    abstract fun isPure(): Boolean

    /**
     * Determines if the expression is constant.
     */
    open fun isConstant(): Boolean = false

    /**
     * Determines if the expression is guaranteed not to be null.
     */
    open fun isNonNull(): Boolean = false

    /**
     * Replaces a sub-expression within the expression.
     *
     * @param oldNode The sub-expression to be replaced.
     * @param newNode The new sub-expression to replace with.
     */
    open fun replaceExpression(oldNode: Expression, newNode: Expression) {}
}

/**
 * Represents a literal value in the source code.
 */
abstract class Literal : Expression() {
    /**
     * Determines if the literal is pure (has no side effects).
     */
    override fun isPure(): Boolean = true

    /**
     * Determines if the literal is constant.
     */
    override fun isConstant(): Boolean = true
}

/**
 * Represents a literal `null` value in the source code.
 */
object NullLiteral : Literal() {
    /**
     * Returns a string representation of the literal.
     */
    override fun toString(): String = "null"
}

/**
 * Represents a literal boolean value (true or false) in the source code.
 *
 * @property value The boolean value.
 * @property sourceReference A reference to the source code.
 */
data class BooleanLiteral(
    val value: Boolean,
    val sourceReference: SourceReference? = null
) : Literal() {
    /**
     * Returns a string representation of the literal.
     */
    override fun toString(): String = if (value) "true" else "false"
}

/**
 * Represents an integer literal in the source code.
 *
 * @property value The integer value as a string.
 * @property sourceReference A reference to the source code.
 */
data class IntegerLiteral(
    val value: String,
    val sourceReference: SourceReference? = null
) : Literal() {
    /**
     * Returns a string representation of the literal.
     */
    override fun toString(): String = value
}

/**
 * Represents a real (floating-point) literal in the source code.
 *
 * @property value The real value as a string.
 * @property sourceReference A reference to the source code.
 */
data class RealLiteral(
    val value: String,
    val sourceReference: SourceReference? = null
) : Literal() {
    /**
     * Returns a string representation of the literal.
     */
    override fun toString(): String = value
}

/**
 * Represents a string literal in the source code.
 *
 * @property value The string value.
 * @property sourceReference A reference to the source code.
 * @property translate Indicates whether the string should be translated.
 */
class StringLiteral(
    val value: String,
    val sourceReference: SourceReference? = null,
    var translate: Boolean = false
) : Literal() {
    /**
     * Returns a string representation of the literal.
     */
    override fun toString(): String = value

    /**
     * Evaluates the literal string value by removing quotes and unescaping.
     *
     * @return The unescaped string, or null if the string is invalid.
     */
    fun eval(): String {
        if (value.length >= 2 && value.startsWith("\"") && value.endsWith("\"")) {
            val noQuotes = value.substring(1, value.length - 1)
            // unescape.
            return noQuotes.compress()
        }
        return value
    }

    /**
     * Determines if the string literal is guaranteed not to be null.
     */
    override fun isNonNull(): Boolean = true

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as StringLiteral

        if (translate != other.translate) return false
        if (value != other.value) return false
        if (sourceReference != other.sourceReference) return false

        return true
    }

    override fun hashCode(): Int {
        var result = translate.hashCode()
        result = 31 * result + value.hashCode()
        result = 31 * result + (sourceReference?.hashCode() ?: 0)
        return result
    }
}

/**
 * Represents an expression with one operand in the source code.
 *
 * Supports operators such as +, -, !, ~, ref, out.
 *
 * @property operator The unary operator.
 * @property inner The operand of the expression.
 * @property sourceReference A reference to the source code.
 */
class UnaryExpression(
    val operator: UnaryOperator,
    var inner: Expression,
    val sourceReference: SourceReference? = null
) : Expression() {
    /**
     * Returns a string representation of the unary expression.
     */
    override fun toString(): String = operator.toString() + inner.toString()

    /**
     * Determines if the unary expression is pure (has no side effects).
     */
    override fun isPure(): Boolean =
        when (operator) {
            UnaryOperator.INCREMENT, UnaryOperator.DECREMENT -> false
            else -> inner.isPure()
        }

    /**
     * Determines if the unary expression is constant.
     */
    override fun isConstant(): Boolean =
        when (operator) {
            UnaryOperator.INCREMENT, UnaryOperator.DECREMENT -> false
            UnaryOperator.REF, UnaryOperator.OUT -> {
                // In the Vala code, this checks if 'inner' is a static field.
                // Since we don't have symbol references, we'll return false here.
                false
            }

            else -> inner.isConstant()
        }

    /**
     * Replaces a sub-expression within the unary expression.
     *
     * @param oldNode The sub-expression to be replaced.
     * @param newNode The new sub-expression to replace with.
     */
    override fun replaceExpression(oldNode: Expression, newNode: Expression) {
        if (inner == oldNode) {
            inner = newNode
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as UnaryExpression

        if (operator != other.operator) return false
        if (inner != other.inner) return false
        if (sourceReference != other.sourceReference) return false

        return true
    }

    override fun hashCode(): Int {
        var result = operator.hashCode()
        result = 31 * result + inner.hashCode()
        result = 31 * result + (sourceReference?.hashCode() ?: 0)
        return result
    }
}

/**
 * Represents a fixed-length sequence of expressions in the source code.
 *
 * @property sourceReference A reference to the source code.
 */
class Tuple(
    val sourceReference: SourceReference? = null
) : Expression() {
    private val expressionList = mutableListOf<Expression>()

    /**
     * Adds an expression to the tuple.
     *
     * @param expr The expression to add.
     */
    fun addExpression(expr: Expression) {
        expressionList.add(expr)
    }

    /**
     * Returns the list of expressions in the tuple.
     *
     * @return The list of expressions.
     */
    fun getExpressions(): List<Expression> = expressionList

    /**
     * Determines if the tuple is pure (has no side effects).
     */
    override fun isPure(): Boolean = false

    /**
     * Replaces a sub-expression within the tuple.
     *
     * @param oldNode The sub-expression to be replaced.
     * @param newNode The new sub-expression to replace with.
     */
    override fun replaceExpression(oldNode: Expression, newNode: Expression) {
        for (i in expressionList.indices) {
            if (expressionList[i] == oldNode) {
                expressionList[i] = newNode
            }
        }
    }

    /**
     * Returns a string representation of the tuple.
     */
    override fun toString(): String = expressionList.joinToString(", ", "(", ")") { it.toString() }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Tuple

        if (sourceReference != other.sourceReference) return false
        if (expressionList != other.expressionList) return false

        return true
    }

    override fun hashCode(): Int {
        var result = sourceReference?.hashCode() ?: 0
        result = 31 * result + expressionList.hashCode()
        return result
    }
}

/**
 * Represents an access to a type member in the source code.
 *
 * @property inner The parent of the member.
 * @property memberName The name of the accessed member.
 * @property sourceReference A reference to the source code.
 */
data class MemberAccess(
    val inner: Expression?,
    val memberName: String,
    val sourceReference: SourceReference? = null
) : Expression() {
    // Stubbed implementation, replace with actual logic.
    override fun isPure(): Boolean = false

    override fun toString(): String = "${inner?.toString()}.$memberName"
}

/**
 * Represents a unary operator in the source code.
 */
enum class UnaryOperator(val symbol: String) {
    NONE(""),
    PLUS("+"),
    MINUS("-"),
    LOGICAL_NEGATION("!"),
    BITWISE_COMPLEMENT("~"),
    INCREMENT("++"),
    DECREMENT("--"),
    REF("ref "),
    OUT("out ");

    /**
     * Returns the string representation of the operator.
     */
    override fun toString(): String = symbol
}
