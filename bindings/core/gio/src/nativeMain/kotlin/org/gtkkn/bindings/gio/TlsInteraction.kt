// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.gio.annotations.GioVersion2_40
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GTlsInteraction
import org.gtkkn.native.gio.g_tls_interaction_ask_password
import org.gtkkn.native.gio.g_tls_interaction_ask_password_async
import org.gtkkn.native.gio.g_tls_interaction_ask_password_finish
import org.gtkkn.native.gio.g_tls_interaction_get_type
import org.gtkkn.native.gio.g_tls_interaction_invoke_ask_password
import org.gtkkn.native.gio.g_tls_interaction_invoke_request_certificate
import org.gtkkn.native.gio.g_tls_interaction_request_certificate
import org.gtkkn.native.gio.g_tls_interaction_request_certificate_async
import org.gtkkn.native.gio.g_tls_interaction_request_certificate_finish
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import kotlin.Result
import kotlin.Unit

/**
 * `GTlsInteraction` provides a mechanism for the TLS connection and database
 * code to interact with the user. It can be used to ask the user for passwords.
 *
 * To use a `GTlsInteraction` with a TLS connection use
 * [method@Gio.TlsConnection.set_interaction].
 *
 * Callers should instantiate a derived class that implements the various
 * interaction methods to show the required dialogs.
 *
 * Callers should use the 'invoke' functions like
 * [method@Gio.TlsInteraction.invoke_ask_password] to run interaction methods.
 * These functions make sure that the interaction is invoked in the main loop
 * and not in the current thread, if the current thread is not running the
 * main loop.
 *
 * Derived classes can choose to implement whichever interactions methods they’d
 * like to support by overriding those virtual methods in their class
 * initialization function. Any interactions not implemented will return
 * `G_TLS_INTERACTION_UNHANDLED`. If a derived class implements an async method,
 * it must also implement the corresponding finish method.
 * @since 2.30
 */
@GioVersion2_30
public open class TlsInteraction(pointer: CPointer<GTlsInteraction>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gioTlsInteractionPointer: CPointer<GTlsInteraction>
        get() = gPointer.reinterpret()

    /**
     * Run synchronous interaction to ask the user for a password. In general,
     * g_tls_interaction_invoke_ask_password() should be used instead of this
     * function.
     *
     * Derived subclasses usually implement a password prompt, although they may
     * also choose to provide a password from elsewhere. The @password value will
     * be filled in and then @callback will be called. Alternatively the user may
     * abort this password request, which will usually abort the TLS connection.
     *
     * If the interaction is cancelled by the cancellation object, or by the
     * user then %G_TLS_INTERACTION_FAILED will be returned with an error that
     * contains a %G_IO_ERROR_CANCELLED error code. Certain implementations may
     * not support immediate cancellation.
     *
     * @param password a #GTlsPassword object
     * @param cancellable an optional #GCancellable cancellation object
     * @return The status of the ask password interaction.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun askPassword(password: TlsPassword, cancellable: Cancellable? = null): Result<TlsInteractionResult> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_tls_interaction_ask_password(
                gioTlsInteractionPointer.reinterpret(),
                password.gioTlsPasswordPointer.reinterpret(),
                cancellable?.gioCancellablePointer?.reinterpret(),
                gError.ptr
            ).run {
                TlsInteractionResult.fromNativeValue(this)
            }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Run asynchronous interaction to ask the user for a password. In general,
     * g_tls_interaction_invoke_ask_password() should be used instead of this
     * function.
     *
     * Derived subclasses usually implement a password prompt, although they may
     * also choose to provide a password from elsewhere. The @password value will
     * be filled in and then @callback will be called. Alternatively the user may
     * abort this password request, which will usually abort the TLS connection.
     *
     * If the interaction is cancelled by the cancellation object, or by the
     * user then %G_TLS_INTERACTION_FAILED will be returned with an error that
     * contains a %G_IO_ERROR_CANCELLED error code. Certain implementations may
     * not support immediate cancellation.
     *
     * Certain implementations may not support immediate cancellation.
     *
     * @param password a #GTlsPassword object
     * @param cancellable an optional #GCancellable cancellation object
     * @param callback will be called when the interaction completes
     * @since 2.30
     */
    @GioVersion2_30
    public open fun askPasswordAsync(
        password: TlsPassword,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_tls_interaction_ask_password_async(
        gioTlsInteractionPointer.reinterpret(),
        password.gioTlsPasswordPointer.reinterpret(),
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Complete an ask password user interaction request. This should be once
     * the g_tls_interaction_ask_password_async() completion callback is called.
     *
     * If %G_TLS_INTERACTION_HANDLED is returned, then the #GTlsPassword passed
     * to g_tls_interaction_ask_password() will have its password filled in.
     *
     * If the interaction is cancelled by the cancellation object, or by the
     * user then %G_TLS_INTERACTION_FAILED will be returned with an error that
     * contains a %G_IO_ERROR_CANCELLED error code.
     *
     * @param result the result passed to the callback
     * @return The status of the ask password interaction.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun askPasswordFinish(result: AsyncResult): Result<TlsInteractionResult> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_tls_interaction_ask_password_finish(
            gioTlsInteractionPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        ).run {
            TlsInteractionResult.fromNativeValue(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Invoke the interaction to ask the user for a password. It invokes this
     * interaction in the main loop, specifically the #GMainContext returned by
     * g_main_context_get_thread_default() when the interaction is created. This
     * is called by called by #GTlsConnection or #GTlsDatabase to ask the user
     * for a password.
     *
     * Derived subclasses usually implement a password prompt, although they may
     * also choose to provide a password from elsewhere. The @password value will
     * be filled in and then @callback will be called. Alternatively the user may
     * abort this password request, which will usually abort the TLS connection.
     *
     * The implementation can either be a synchronous (eg: modal dialog) or an
     * asynchronous one (eg: modeless dialog). This function will take care of
     * calling which ever one correctly.
     *
     * If the interaction is cancelled by the cancellation object, or by the
     * user then %G_TLS_INTERACTION_FAILED will be returned with an error that
     * contains a %G_IO_ERROR_CANCELLED error code. Certain implementations may
     * not support immediate cancellation.
     *
     * @param password a #GTlsPassword object
     * @param cancellable an optional #GCancellable cancellation object
     * @return The status of the ask password interaction.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun invokeAskPassword(
        password: TlsPassword,
        cancellable: Cancellable? = null,
    ): Result<TlsInteractionResult> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_tls_interaction_invoke_ask_password(
            gioTlsInteractionPointer.reinterpret(),
            password.gioTlsPasswordPointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).run {
            TlsInteractionResult.fromNativeValue(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Invoke the interaction to ask the user to choose a certificate to
     * use with the connection. It invokes this interaction in the main
     * loop, specifically the #GMainContext returned by
     * g_main_context_get_thread_default() when the interaction is
     * created. This is called by called by #GTlsConnection when the peer
     * requests a certificate during the handshake.
     *
     * Derived subclasses usually implement a certificate selector,
     * although they may also choose to provide a certificate from
     * elsewhere. Alternatively the user may abort this certificate
     * request, which may or may not abort the TLS connection.
     *
     * The implementation can either be a synchronous (eg: modal dialog) or an
     * asynchronous one (eg: modeless dialog). This function will take care of
     * calling which ever one correctly.
     *
     * If the interaction is cancelled by the cancellation object, or by the
     * user then %G_TLS_INTERACTION_FAILED will be returned with an error that
     * contains a %G_IO_ERROR_CANCELLED error code. Certain implementations may
     * not support immediate cancellation.
     *
     * @param connection a #GTlsConnection object
     * @param flags flags providing more information about the request
     * @param cancellable an optional #GCancellable cancellation object
     * @return The status of the certificate request interaction.
     * @since 2.40
     */
    @GioVersion2_40
    public open fun invokeRequestCertificate(
        connection: TlsConnection,
        flags: TlsCertificateRequestFlags,
        cancellable: Cancellable? = null,
    ): Result<TlsInteractionResult> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_tls_interaction_invoke_request_certificate(
            gioTlsInteractionPointer.reinterpret(),
            connection.gioTlsConnectionPointer.reinterpret(),
            flags.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).run {
            TlsInteractionResult.fromNativeValue(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Run synchronous interaction to ask the user to choose a certificate to use
     * with the connection. In general, g_tls_interaction_invoke_request_certificate()
     * should be used instead of this function.
     *
     * Derived subclasses usually implement a certificate selector, although they may
     * also choose to provide a certificate from elsewhere. Alternatively the user may
     * abort this certificate request, which will usually abort the TLS connection.
     *
     * If %G_TLS_INTERACTION_HANDLED is returned, then the #GTlsConnection
     * passed to g_tls_interaction_request_certificate() will have had its
     * #GTlsConnection:certificate filled in.
     *
     * If the interaction is cancelled by the cancellation object, or by the
     * user then %G_TLS_INTERACTION_FAILED will be returned with an error that
     * contains a %G_IO_ERROR_CANCELLED error code. Certain implementations may
     * not support immediate cancellation.
     *
     * @param connection a #GTlsConnection object
     * @param flags flags providing more information about the request
     * @param cancellable an optional #GCancellable cancellation object
     * @return The status of the request certificate interaction.
     * @since 2.40
     */
    @GioVersion2_40
    public open fun requestCertificate(
        connection: TlsConnection,
        flags: TlsCertificateRequestFlags,
        cancellable: Cancellable? = null,
    ): Result<TlsInteractionResult> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_tls_interaction_request_certificate(
            gioTlsInteractionPointer.reinterpret(),
            connection.gioTlsConnectionPointer.reinterpret(),
            flags.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).run {
            TlsInteractionResult.fromNativeValue(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Run asynchronous interaction to ask the user for a certificate to use with
     * the connection. In general, g_tls_interaction_invoke_request_certificate() should
     * be used instead of this function.
     *
     * Derived subclasses usually implement a certificate selector, although they may
     * also choose to provide a certificate from elsewhere. @callback will be called
     * when the operation completes. Alternatively the user may abort this certificate
     * request, which will usually abort the TLS connection.
     *
     * @param connection a #GTlsConnection object
     * @param flags flags providing more information about the request
     * @param cancellable an optional #GCancellable cancellation object
     * @param callback will be called when the interaction completes
     * @since 2.40
     */
    @GioVersion2_40
    public open fun requestCertificateAsync(
        connection: TlsConnection,
        flags: TlsCertificateRequestFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_tls_interaction_request_certificate_async(
        gioTlsInteractionPointer.reinterpret(),
        connection.gioTlsConnectionPointer.reinterpret(),
        flags.nativeValue,
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Complete a request certificate user interaction request. This should be once
     * the g_tls_interaction_request_certificate_async() completion callback is called.
     *
     * If %G_TLS_INTERACTION_HANDLED is returned, then the #GTlsConnection
     * passed to g_tls_interaction_request_certificate_async() will have had its
     * #GTlsConnection:certificate filled in.
     *
     * If the interaction is cancelled by the cancellation object, or by the
     * user then %G_TLS_INTERACTION_FAILED will be returned with an error that
     * contains a %G_IO_ERROR_CANCELLED error code.
     *
     * @param result the result passed to the callback
     * @return The status of the request certificate interaction.
     * @since 2.40
     */
    @GioVersion2_40
    public open fun requestCertificateFinish(result: AsyncResult): Result<TlsInteractionResult> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_tls_interaction_request_certificate_finish(
            gioTlsInteractionPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        ).run {
            TlsInteractionResult.fromNativeValue(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    public companion object : TypeCompanion<TlsInteraction> {
        override val type: GeneratedClassKGType<TlsInteraction> =
            GeneratedClassKGType(g_tls_interaction_get_type()) { TlsInteraction(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of TlsInteraction
         *
         * @return the GType
         */
        public fun getType(): GType = g_tls_interaction_get_type()
    }
}
