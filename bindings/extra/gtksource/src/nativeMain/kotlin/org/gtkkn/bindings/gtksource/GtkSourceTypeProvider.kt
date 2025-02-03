// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import org.gtkkn.extensions.gobject.legacy.KGType
import org.gtkkn.extensions.gobject.legacy.TypeProvider
import kotlin.reflect.KClass

public object GtkSourceTypeProvider : TypeProvider {
    override val typeMap: kotlin.collections.Map<KClass<*>, KGType<*>> = buildMap {
        if (Buffer.getTypeOrNull() != null) put(Buffer::class, Buffer.type)
        if (Completion.getTypeOrNull() != null) put(Completion::class, Completion.type)
        if (CompletionCell.getTypeOrNull() != null) put(CompletionCell::class, CompletionCell.type)
        if (CompletionContext.getTypeOrNull() != null) put(CompletionContext::class, CompletionContext.type)
        if (CompletionSnippets.getTypeOrNull() != null) put(CompletionSnippets::class, CompletionSnippets.type)
        if (CompletionWords.getTypeOrNull() != null) put(CompletionWords::class, CompletionWords.type)
        if (File.getTypeOrNull() != null) put(File::class, File.type)
        if (FileLoader.getTypeOrNull() != null) put(FileLoader::class, FileLoader.type)
        if (FileSaver.getTypeOrNull() != null) put(FileSaver::class, FileSaver.type)
        if (Gutter.getTypeOrNull() != null) put(Gutter::class, Gutter.type)
        if (GutterLines.getTypeOrNull() != null) put(GutterLines::class, GutterLines.type)
        if (GutterRenderer.getTypeOrNull() != null) put(GutterRenderer::class, GutterRenderer.type)
        if (GutterRendererPixbuf.getTypeOrNull() != null) put(GutterRendererPixbuf::class, GutterRendererPixbuf.type)
        if (GutterRendererText.getTypeOrNull() != null) put(GutterRendererText::class, GutterRendererText.type)
        if (Hover.getTypeOrNull() != null) put(Hover::class, Hover.type)
        if (HoverContext.getTypeOrNull() != null) put(HoverContext::class, HoverContext.type)
        if (HoverDisplay.getTypeOrNull() != null) put(HoverDisplay::class, HoverDisplay.type)
        if (Language.getTypeOrNull() != null) put(Language::class, Language.type)
        if (LanguageManager.getTypeOrNull() != null) put(LanguageManager::class, LanguageManager.type)
        if (Map.getTypeOrNull() != null) put(Map::class, Map.type)
        if (Mark.getTypeOrNull() != null) put(Mark::class, Mark.type)
        if (MarkAttributes.getTypeOrNull() != null) put(MarkAttributes::class, MarkAttributes.type)
        if (PrintCompositor.getTypeOrNull() != null) put(PrintCompositor::class, PrintCompositor.type)
        if (Region.getTypeOrNull() != null) put(Region::class, Region.type)
        if (SearchContext.getTypeOrNull() != null) put(SearchContext::class, SearchContext.type)
        if (SearchSettings.getTypeOrNull() != null) put(SearchSettings::class, SearchSettings.type)
        if (Snippet.getTypeOrNull() != null) put(Snippet::class, Snippet.type)
        if (SnippetChunk.getTypeOrNull() != null) put(SnippetChunk::class, SnippetChunk.type)
        if (SnippetContext.getTypeOrNull() != null) put(SnippetContext::class, SnippetContext.type)
        if (SnippetManager.getTypeOrNull() != null) put(SnippetManager::class, SnippetManager.type)
        if (SpaceDrawer.getTypeOrNull() != null) put(SpaceDrawer::class, SpaceDrawer.type)
        if (Style.getTypeOrNull() != null) put(Style::class, Style.type)
        if (StyleScheme.getTypeOrNull() != null) put(StyleScheme::class, StyleScheme.type)
        if (StyleSchemeChooserButton.getTypeOrNull() !=
            null
        ) {
            put(StyleSchemeChooserButton::class, StyleSchemeChooserButton.type)
        }
        if (StyleSchemeChooserWidget.getTypeOrNull() !=
            null
        ) {
            put(StyleSchemeChooserWidget::class, StyleSchemeChooserWidget.type)
        }
        if (StyleSchemeManager.getTypeOrNull() != null) put(StyleSchemeManager::class, StyleSchemeManager.type)
        if (StyleSchemePreview.getTypeOrNull() != null) put(StyleSchemePreview::class, StyleSchemePreview.type)
        if (Tag.getTypeOrNull() != null) put(Tag::class, Tag.type)
        if (View.getTypeOrNull() != null) put(View::class, View.type)
        if (VimImContext.getTypeOrNull() != null) put(VimImContext::class, VimImContext.type)
        if (CompletionProposal.getTypeOrNull() != null) put(CompletionProposal::class, CompletionProposal.type)
        if (CompletionProvider.getTypeOrNull() != null) put(CompletionProvider::class, CompletionProvider.type)
        if (HoverProvider.getTypeOrNull() != null) put(HoverProvider::class, HoverProvider.type)
        if (Indenter.getTypeOrNull() != null) put(Indenter::class, Indenter.type)
        if (StyleSchemeChooser.getTypeOrNull() != null) put(StyleSchemeChooser::class, StyleSchemeChooser.type)
    }
}
