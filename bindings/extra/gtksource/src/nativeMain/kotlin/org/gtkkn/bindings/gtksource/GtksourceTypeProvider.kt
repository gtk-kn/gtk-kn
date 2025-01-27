// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.KGType
import org.gtkkn.extensions.gobject.TypeProvider
import kotlin.reflect.KClass

public object GtksourceTypeProvider : TypeProvider {
    override val typeMap: kotlin.collections.Map<KClass<*>, KGType<*>> = buildMap {
        if (getTypeOrNull("gtk_source_buffer_get_type") != null) put(Buffer::class, Buffer.type)
        if (getTypeOrNull("gtk_source_completion_get_type") != null) put(Completion::class, Completion.type)
        if (getTypeOrNull("gtk_source_completion_cell_get_type") !=
            null
        ) {
            put(CompletionCell::class, CompletionCell.type)
        }
        if (getTypeOrNull("gtk_source_completion_context_get_type") !=
            null
        ) {
            put(CompletionContext::class, CompletionContext.type)
        }
        if (getTypeOrNull("gtk_source_completion_snippets_get_type") !=
            null
        ) {
            put(CompletionSnippets::class, CompletionSnippets.type)
        }
        if (getTypeOrNull("gtk_source_completion_words_get_type") !=
            null
        ) {
            put(CompletionWords::class, CompletionWords.type)
        }
        if (getTypeOrNull("gtk_source_file_get_type") != null) put(File::class, File.type)
        if (getTypeOrNull("gtk_source_file_loader_get_type") != null) put(FileLoader::class, FileLoader.type)
        if (getTypeOrNull("gtk_source_file_saver_get_type") != null) put(FileSaver::class, FileSaver.type)
        if (getTypeOrNull("gtk_source_gutter_get_type") != null) put(Gutter::class, Gutter.type)
        if (getTypeOrNull("gtk_source_gutter_lines_get_type") != null) put(GutterLines::class, GutterLines.type)
        if (getTypeOrNull("gtk_source_gutter_renderer_get_type") !=
            null
        ) {
            put(GutterRenderer::class, GutterRenderer.type)
        }
        if (getTypeOrNull("gtk_source_gutter_renderer_pixbuf_get_type") !=
            null
        ) {
            put(GutterRendererPixbuf::class, GutterRendererPixbuf.type)
        }
        if (getTypeOrNull("gtk_source_gutter_renderer_text_get_type") !=
            null
        ) {
            put(GutterRendererText::class, GutterRendererText.type)
        }
        if (getTypeOrNull("gtk_source_hover_get_type") != null) put(Hover::class, Hover.type)
        if (getTypeOrNull("gtk_source_hover_context_get_type") != null) put(HoverContext::class, HoverContext.type)
        if (getTypeOrNull("gtk_source_hover_display_get_type") != null) put(HoverDisplay::class, HoverDisplay.type)
        if (getTypeOrNull("gtk_source_language_get_type") != null) put(Language::class, Language.type)
        if (getTypeOrNull("gtk_source_language_manager_get_type") !=
            null
        ) {
            put(LanguageManager::class, LanguageManager.type)
        }
        if (getTypeOrNull("gtk_source_map_get_type") != null) put(Map::class, Map.type)
        if (getTypeOrNull("gtk_source_mark_get_type") != null) put(Mark::class, Mark.type)
        if (getTypeOrNull("gtk_source_mark_attributes_get_type") !=
            null
        ) {
            put(MarkAttributes::class, MarkAttributes.type)
        }
        if (getTypeOrNull("gtk_source_print_compositor_get_type") !=
            null
        ) {
            put(PrintCompositor::class, PrintCompositor.type)
        }
        if (getTypeOrNull("gtk_source_region_get_type") != null) put(Region::class, Region.type)
        if (getTypeOrNull("gtk_source_search_context_get_type") != null) put(SearchContext::class, SearchContext.type)
        if (getTypeOrNull("gtk_source_search_settings_get_type") !=
            null
        ) {
            put(SearchSettings::class, SearchSettings.type)
        }
        if (getTypeOrNull("gtk_source_snippet_get_type") != null) put(Snippet::class, Snippet.type)
        if (getTypeOrNull("gtk_source_snippet_chunk_get_type") != null) put(SnippetChunk::class, SnippetChunk.type)
        if (getTypeOrNull("gtk_source_snippet_context_get_type") !=
            null
        ) {
            put(SnippetContext::class, SnippetContext.type)
        }
        if (getTypeOrNull("gtk_source_snippet_manager_get_type") !=
            null
        ) {
            put(SnippetManager::class, SnippetManager.type)
        }
        if (getTypeOrNull("gtk_source_space_drawer_get_type") != null) put(SpaceDrawer::class, SpaceDrawer.type)
        if (getTypeOrNull("gtk_source_style_get_type") != null) put(Style::class, Style.type)
        if (getTypeOrNull("gtk_source_style_scheme_get_type") != null) put(StyleScheme::class, StyleScheme.type)
        if (getTypeOrNull("gtk_source_style_scheme_chooser_button_get_type") !=
            null
        ) {
            put(StyleSchemeChooserButton::class, StyleSchemeChooserButton.type)
        }
        if (getTypeOrNull("gtk_source_style_scheme_chooser_widget_get_type") !=
            null
        ) {
            put(StyleSchemeChooserWidget::class, StyleSchemeChooserWidget.type)
        }
        if (getTypeOrNull("gtk_source_style_scheme_manager_get_type") !=
            null
        ) {
            put(StyleSchemeManager::class, StyleSchemeManager.type)
        }
        if (getTypeOrNull("gtk_source_style_scheme_preview_get_type") !=
            null
        ) {
            put(StyleSchemePreview::class, StyleSchemePreview.type)
        }
        if (getTypeOrNull("gtk_source_tag_get_type") != null) put(Tag::class, Tag.type)
        if (getTypeOrNull("gtk_source_view_get_type") != null) put(View::class, View.type)
        if (getTypeOrNull("gtk_source_vim_im_context_get_type") != null) put(VimImContext::class, VimImContext.type)
        if (getTypeOrNull("gtk_source_completion_proposal_get_type") !=
            null
        ) {
            put(CompletionProposal::class, CompletionProposal.type)
        }
        if (getTypeOrNull("gtk_source_completion_provider_get_type") !=
            null
        ) {
            put(CompletionProvider::class, CompletionProvider.type)
        }
        if (getTypeOrNull("gtk_source_hover_provider_get_type") != null) put(HoverProvider::class, HoverProvider.type)
        if (getTypeOrNull("gtk_source_indenter_get_type") != null) put(Indenter::class, Indenter.type)
        if (getTypeOrNull("gtk_source_style_scheme_chooser_get_type") !=
            null
        ) {
            put(StyleSchemeChooser::class, StyleSchemeChooser.type)
        }
    }
}
