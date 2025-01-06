// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.cairo.Context
import org.gtkkn.bindings.cairo.Region
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.InputStream
import org.gtkkn.bindings.gio.OutputStream
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.native.gdk.GdkContentDeserializer
import org.gtkkn.native.gdk.GdkContentSerializer
import org.gtkkn.native.gdk.gdk_cairo_draw_from_gl
import org.gtkkn.native.gdk.gdk_cairo_rectangle
import org.gtkkn.native.gdk.gdk_cairo_region
import org.gtkkn.native.gdk.gdk_cairo_region_create_from_surface
import org.gtkkn.native.gdk.gdk_cairo_set_source_pixbuf
import org.gtkkn.native.gdk.gdk_cairo_set_source_rgba
import org.gtkkn.native.gdk.gdk_content_deserialize_async
import org.gtkkn.native.gdk.gdk_content_deserialize_finish
import org.gtkkn.native.gdk.gdk_content_register_deserializer
import org.gtkkn.native.gdk.gdk_content_register_serializer
import org.gtkkn.native.gdk.gdk_content_serialize_async
import org.gtkkn.native.gdk.gdk_content_serialize_finish
import org.gtkkn.native.gdk.gdk_drag_surface_size_get_type
import org.gtkkn.native.gdk.gdk_intern_mime_type
import org.gtkkn.native.gdk.gdk_keyval_from_name
import org.gtkkn.native.gdk.gdk_keyval_is_lower
import org.gtkkn.native.gdk.gdk_keyval_is_upper
import org.gtkkn.native.gdk.gdk_keyval_name
import org.gtkkn.native.gdk.gdk_keyval_to_lower
import org.gtkkn.native.gdk.gdk_keyval_to_unicode
import org.gtkkn.native.gdk.gdk_keyval_to_upper
import org.gtkkn.native.gdk.gdk_pixbuf_get_from_surface
import org.gtkkn.native.gdk.gdk_pixbuf_get_from_texture
import org.gtkkn.native.gdk.gdk_set_allowed_backends
import org.gtkkn.native.gdk.gdk_toplevel_size_get_type
import org.gtkkn.native.gdk.gdk_unicode_to_keyval
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.guint8
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - parameter `angle`: angle: Out parameter is not supported
 * - parameter `x`: x: Out parameter is not supported
 * - parameter `distance`: distance: Out parameter is not supported
 * - parameter `lower`: lower: Out parameter is not supported
 * - parameter `index_ranges`: Unsupported pointer to primitive type
 * - parameter `index_ranges`: Array parameter of type gint is not supported
 * - record `ContentProviderClass`: glib type struct are ignored
 * - record `DevicePadInterface`: glib type struct are ignored
 * - record `DmabufTextureBuilderClass`: glib type struct are ignored
 * - record `DmabufTextureClass`: glib type struct are ignored
 * - record `DragSurfaceInterface`: glib type struct are ignored
 * - record `FrameClockClass`: glib type struct are ignored
 * - record `GLTextureBuilderClass`: glib type struct are ignored
 * - record `GLTextureClass`: glib type struct are ignored
 * - record `MemoryTextureClass`: glib type struct are ignored
 * - record `MonitorClass`: glib type struct are ignored
 * - record `PaintableInterface`: glib type struct are ignored
 * - record `PopupInterface`: glib type struct are ignored
 * - record `SnapshotClass`: glib type struct are ignored
 * - record `SurfaceClass`: glib type struct are ignored
 * - record `TextureClass`: glib type struct are ignored
 * - record `ToplevelInterface`: glib type struct are ignored
 */
public object Gdk {
    /**
     * Defines all possible DND actions.
     *
     * This can be used in [method@Gdk.Drop.status] messages when any drop
     * can be accepted or a more specific drop method is not yet known.
     */
    public const val ACTION_ALL: gint = 7

    /**
     * The middle button.
     */
    public const val BUTTON_MIDDLE: gint = 2

    /**
     * The primary button. This is typically the left mouse button, or the
     * right button in a left-handed setup.
     */
    public const val BUTTON_PRIMARY: gint = 1

    /**
     * The secondary button. This is typically the right mouse button, or the
     * left button in a left-handed setup.
     */
    public const val BUTTON_SECONDARY: gint = 3

    /**
     * Represents the current time, and can be used anywhere a time is expected.
     */
    public const val CURRENT_TIME: gint = 0

    /**
     * Use this macro as the return value for continuing the propagation of
     * an event handler.
     */
    public const val EVENT_PROPAGATE: Boolean = false

    /**
     * Use this macro as the return value for stopping the propagation of
     * an event handler.
     */
    public const val EVENT_STOP: Boolean = true

    public const val KEY_0: gint = 48

    public const val KEY_1: gint = 49

    public const val KEY_2: gint = 50

    public const val KEY_3: gint = 51

    public const val KEY_3270_AltCursor: gint = 64784

    public const val KEY_3270_Attn: gint = 64782

    public const val KEY_3270_BackTab: gint = 64773

    public const val KEY_3270_ChangeScreen: gint = 64793

    public const val KEY_3270_Copy: gint = 64789

    public const val KEY_3270_CursorBlink: gint = 64783

    public const val KEY_3270_CursorSelect: gint = 64796

    public const val KEY_3270_DeleteWord: gint = 64794

    public const val KEY_3270_Duplicate: gint = 64769

    public const val KEY_3270_Enter: gint = 64798

    public const val KEY_3270_EraseEOF: gint = 64774

    public const val KEY_3270_EraseInput: gint = 64775

    public const val KEY_3270_ExSelect: gint = 64795

    public const val KEY_3270_FieldMark: gint = 64770

    public const val KEY_3270_Ident: gint = 64787

    public const val KEY_3270_Jump: gint = 64786

    public const val KEY_3270_KeyClick: gint = 64785

    public const val KEY_3270_Left2: gint = 64772

    public const val KEY_3270_PA1: gint = 64778

    public const val KEY_3270_PA2: gint = 64779

    public const val KEY_3270_PA3: gint = 64780

    public const val KEY_3270_Play: gint = 64790

    public const val KEY_3270_PrintScreen: gint = 64797

    public const val KEY_3270_Quit: gint = 64777

    public const val KEY_3270_Record: gint = 64792

    public const val KEY_3270_Reset: gint = 64776

    public const val KEY_3270_Right2: gint = 64771

    public const val KEY_3270_Rule: gint = 64788

    public const val KEY_3270_Setup: gint = 64791

    public const val KEY_3270_Test: gint = 64781

    public const val KEY_4: gint = 52

    public const val KEY_5: gint = 53

    public const val KEY_6: gint = 54

    public const val KEY_7: gint = 55

    public const val KEY_8: gint = 56

    public const val KEY_9: gint = 57

    public const val KEY_A: gint = 65

    public const val KEY_AE: gint = 198

    public const val KEY_Aacute: gint = 193

    public const val KEY_Abelowdot: gint = 16785056

    public const val KEY_Abreve: gint = 451

    public const val KEY_Abreveacute: gint = 16785070

    public const val KEY_Abrevebelowdot: gint = 16785078

    public const val KEY_Abrevegrave: gint = 16785072

    public const val KEY_Abrevehook: gint = 16785074

    public const val KEY_Abrevetilde: gint = 16785076

    public const val KEY_AccessX_Enable: gint = 65136

    public const val KEY_AccessX_Feedback_Enable: gint = 65137

    public const val KEY_Acircumflex: gint = 194

    public const val KEY_Acircumflexacute: gint = 16785060

    public const val KEY_Acircumflexbelowdot: gint = 16785068

    public const val KEY_Acircumflexgrave: gint = 16785062

    public const val KEY_Acircumflexhook: gint = 16785064

    public const val KEY_Acircumflextilde: gint = 16785066

    public const val KEY_AddFavorite: gint = 269025081

    public const val KEY_Adiaeresis: gint = 196

    public const val KEY_Agrave: gint = 192

    public const val KEY_Ahook: gint = 16785058

    public const val KEY_Alt_L: gint = 65513

    public const val KEY_Alt_R: gint = 65514

    public const val KEY_Amacron: gint = 960

    public const val KEY_Aogonek: gint = 417

    public const val KEY_ApplicationLeft: gint = 269025104

    public const val KEY_ApplicationRight: gint = 269025105

    public const val KEY_Arabic_0: gint = 16778848

    public const val KEY_Arabic_1: gint = 16778849

    public const val KEY_Arabic_2: gint = 16778850

    public const val KEY_Arabic_3: gint = 16778851

    public const val KEY_Arabic_4: gint = 16778852

    public const val KEY_Arabic_5: gint = 16778853

    public const val KEY_Arabic_6: gint = 16778854

    public const val KEY_Arabic_7: gint = 16778855

    public const val KEY_Arabic_8: gint = 16778856

    public const val KEY_Arabic_9: gint = 16778857

    public const val KEY_Arabic_ain: gint = 1497

    public const val KEY_Arabic_alef: gint = 1479

    public const val KEY_Arabic_alefmaksura: gint = 1513

    public const val KEY_Arabic_beh: gint = 1480

    public const val KEY_Arabic_comma: gint = 1452

    public const val KEY_Arabic_dad: gint = 1494

    public const val KEY_Arabic_dal: gint = 1487

    public const val KEY_Arabic_damma: gint = 1519

    public const val KEY_Arabic_dammatan: gint = 1516

    public const val KEY_Arabic_ddal: gint = 16778888

    public const val KEY_Arabic_farsi_yeh: gint = 16778956

    public const val KEY_Arabic_fatha: gint = 1518

    public const val KEY_Arabic_fathatan: gint = 1515

    public const val KEY_Arabic_feh: gint = 1505

    public const val KEY_Arabic_fullstop: gint = 16778964

    public const val KEY_Arabic_gaf: gint = 16778927

    public const val KEY_Arabic_ghain: gint = 1498

    public const val KEY_Arabic_ha: gint = 1511

    public const val KEY_Arabic_hah: gint = 1485

    public const val KEY_Arabic_hamza: gint = 1473

    public const val KEY_Arabic_hamza_above: gint = 16778836

    public const val KEY_Arabic_hamza_below: gint = 16778837

    public const val KEY_Arabic_hamzaonalef: gint = 1475

    public const val KEY_Arabic_hamzaonwaw: gint = 1476

    public const val KEY_Arabic_hamzaonyeh: gint = 1478

    public const val KEY_Arabic_hamzaunderalef: gint = 1477

    public const val KEY_Arabic_heh: gint = 1511

    public const val KEY_Arabic_heh_doachashmee: gint = 16778942

    public const val KEY_Arabic_heh_goal: gint = 16778945

    public const val KEY_Arabic_jeem: gint = 1484

    public const val KEY_Arabic_jeh: gint = 16778904

    public const val KEY_Arabic_kaf: gint = 1507

    public const val KEY_Arabic_kasra: gint = 1520

    public const val KEY_Arabic_kasratan: gint = 1517

    public const val KEY_Arabic_keheh: gint = 16778921

    public const val KEY_Arabic_khah: gint = 1486

    public const val KEY_Arabic_lam: gint = 1508

    public const val KEY_Arabic_madda_above: gint = 16778835

    public const val KEY_Arabic_maddaonalef: gint = 1474

    public const val KEY_Arabic_meem: gint = 1509

    public const val KEY_Arabic_noon: gint = 1510

    public const val KEY_Arabic_noon_ghunna: gint = 16778938

    public const val KEY_Arabic_peh: gint = 16778878

    public const val KEY_Arabic_percent: gint = 16778858

    public const val KEY_Arabic_qaf: gint = 1506

    public const val KEY_Arabic_question_mark: gint = 1471

    public const val KEY_Arabic_ra: gint = 1489

    public const val KEY_Arabic_rreh: gint = 16778897

    public const val KEY_Arabic_sad: gint = 1493

    public const val KEY_Arabic_seen: gint = 1491

    public const val KEY_Arabic_semicolon: gint = 1467

    public const val KEY_Arabic_shadda: gint = 1521

    public const val KEY_Arabic_sheen: gint = 1492

    public const val KEY_Arabic_sukun: gint = 1522

    public const val KEY_Arabic_superscript_alef: gint = 16778864

    public const val KEY_Arabic_switch: gint = 65406

    public const val KEY_Arabic_tah: gint = 1495

    public const val KEY_Arabic_tatweel: gint = 1504

    public const val KEY_Arabic_tcheh: gint = 16778886

    public const val KEY_Arabic_teh: gint = 1482

    public const val KEY_Arabic_tehmarbuta: gint = 1481

    public const val KEY_Arabic_thal: gint = 1488

    public const val KEY_Arabic_theh: gint = 1483

    public const val KEY_Arabic_tteh: gint = 16778873

    public const val KEY_Arabic_veh: gint = 16778916

    public const val KEY_Arabic_waw: gint = 1512

    public const val KEY_Arabic_yeh: gint = 1514

    public const val KEY_Arabic_yeh_baree: gint = 16778962

    public const val KEY_Arabic_zah: gint = 1496

    public const val KEY_Arabic_zain: gint = 1490

    public const val KEY_Aring: gint = 197

    public const val KEY_Armenian_AT: gint = 16778552

    public const val KEY_Armenian_AYB: gint = 16778545

    public const val KEY_Armenian_BEN: gint = 16778546

    public const val KEY_Armenian_CHA: gint = 16778569

    public const val KEY_Armenian_DA: gint = 16778548

    public const val KEY_Armenian_DZA: gint = 16778561

    public const val KEY_Armenian_E: gint = 16778551

    public const val KEY_Armenian_FE: gint = 16778582

    public const val KEY_Armenian_GHAT: gint = 16778562

    public const val KEY_Armenian_GIM: gint = 16778547

    public const val KEY_Armenian_HI: gint = 16778565

    public const val KEY_Armenian_HO: gint = 16778560

    public const val KEY_Armenian_INI: gint = 16778555

    public const val KEY_Armenian_JE: gint = 16778571

    public const val KEY_Armenian_KE: gint = 16778580

    public const val KEY_Armenian_KEN: gint = 16778559

    public const val KEY_Armenian_KHE: gint = 16778557

    public const val KEY_Armenian_LYUN: gint = 16778556

    public const val KEY_Armenian_MEN: gint = 16778564

    public const val KEY_Armenian_NU: gint = 16778566

    public const val KEY_Armenian_O: gint = 16778581

    public const val KEY_Armenian_PE: gint = 16778570

    public const val KEY_Armenian_PYUR: gint = 16778579

    public const val KEY_Armenian_RA: gint = 16778572

    public const val KEY_Armenian_RE: gint = 16778576

    public const val KEY_Armenian_SE: gint = 16778573

    public const val KEY_Armenian_SHA: gint = 16778567

    public const val KEY_Armenian_TCHE: gint = 16778563

    public const val KEY_Armenian_TO: gint = 16778553

    public const val KEY_Armenian_TSA: gint = 16778558

    public const val KEY_Armenian_TSO: gint = 16778577

    public const val KEY_Armenian_TYUN: gint = 16778575

    public const val KEY_Armenian_VEV: gint = 16778574

    public const val KEY_Armenian_VO: gint = 16778568

    public const val KEY_Armenian_VYUN: gint = 16778578

    public const val KEY_Armenian_YECH: gint = 16778549

    public const val KEY_Armenian_ZA: gint = 16778550

    public const val KEY_Armenian_ZHE: gint = 16778554

    public const val KEY_Armenian_accent: gint = 16778587

    public const val KEY_Armenian_amanak: gint = 16778588

    public const val KEY_Armenian_apostrophe: gint = 16778586

    public const val KEY_Armenian_at: gint = 16778600

    public const val KEY_Armenian_ayb: gint = 16778593

    public const val KEY_Armenian_ben: gint = 16778594

    public const val KEY_Armenian_but: gint = 16778589

    public const val KEY_Armenian_cha: gint = 16778617

    public const val KEY_Armenian_da: gint = 16778596

    public const val KEY_Armenian_dza: gint = 16778609

    public const val KEY_Armenian_e: gint = 16778599

    public const val KEY_Armenian_exclam: gint = 16778588

    public const val KEY_Armenian_fe: gint = 16778630

    public const val KEY_Armenian_full_stop: gint = 16778633

    public const val KEY_Armenian_ghat: gint = 16778610

    public const val KEY_Armenian_gim: gint = 16778595

    public const val KEY_Armenian_hi: gint = 16778613

    public const val KEY_Armenian_ho: gint = 16778608

    public const val KEY_Armenian_hyphen: gint = 16778634

    public const val KEY_Armenian_ini: gint = 16778603

    public const val KEY_Armenian_je: gint = 16778619

    public const val KEY_Armenian_ke: gint = 16778628

    public const val KEY_Armenian_ken: gint = 16778607

    public const val KEY_Armenian_khe: gint = 16778605

    public const val KEY_Armenian_ligature_ew: gint = 16778631

    public const val KEY_Armenian_lyun: gint = 16778604

    public const val KEY_Armenian_men: gint = 16778612

    public const val KEY_Armenian_nu: gint = 16778614

    public const val KEY_Armenian_o: gint = 16778629

    public const val KEY_Armenian_paruyk: gint = 16778590

    public const val KEY_Armenian_pe: gint = 16778618

    public const val KEY_Armenian_pyur: gint = 16778627

    public const val KEY_Armenian_question: gint = 16778590

    public const val KEY_Armenian_ra: gint = 16778620

    public const val KEY_Armenian_re: gint = 16778624

    public const val KEY_Armenian_se: gint = 16778621

    public const val KEY_Armenian_separation_mark: gint = 16778589

    public const val KEY_Armenian_sha: gint = 16778615

    public const val KEY_Armenian_shesht: gint = 16778587

    public const val KEY_Armenian_tche: gint = 16778611

    public const val KEY_Armenian_to: gint = 16778601

    public const val KEY_Armenian_tsa: gint = 16778606

    public const val KEY_Armenian_tso: gint = 16778625

    public const val KEY_Armenian_tyun: gint = 16778623

    public const val KEY_Armenian_verjaket: gint = 16778633

    public const val KEY_Armenian_vev: gint = 16778622

    public const val KEY_Armenian_vo: gint = 16778616

    public const val KEY_Armenian_vyun: gint = 16778626

    public const val KEY_Armenian_yech: gint = 16778597

    public const val KEY_Armenian_yentamna: gint = 16778634

    public const val KEY_Armenian_za: gint = 16778598

    public const val KEY_Armenian_zhe: gint = 16778602

    public const val KEY_Atilde: gint = 195

    public const val KEY_AudibleBell_Enable: gint = 65146

    public const val KEY_AudioCycleTrack: gint = 269025179

    public const val KEY_AudioForward: gint = 269025175

    public const val KEY_AudioLowerVolume: gint = 269025041

    public const val KEY_AudioMedia: gint = 269025074

    public const val KEY_AudioMicMute: gint = 269025202

    public const val KEY_AudioMute: gint = 269025042

    public const val KEY_AudioNext: gint = 269025047

    public const val KEY_AudioPause: gint = 269025073

    public const val KEY_AudioPlay: gint = 269025044

    public const val KEY_AudioPreset: gint = 269025206

    public const val KEY_AudioPrev: gint = 269025046

    public const val KEY_AudioRaiseVolume: gint = 269025043

    public const val KEY_AudioRandomPlay: gint = 269025177

    public const val KEY_AudioRecord: gint = 269025052

    public const val KEY_AudioRepeat: gint = 269025176

    public const val KEY_AudioRewind: gint = 269025086

    public const val KEY_AudioStop: gint = 269025045

    public const val KEY_Away: gint = 269025165

    public const val KEY_B: gint = 66

    public const val KEY_Babovedot: gint = 16784898

    public const val KEY_Back: gint = 269025062

    public const val KEY_BackForward: gint = 269025087

    public const val KEY_BackSpace: gint = 65288

    public const val KEY_Battery: gint = 269025171

    public const val KEY_Begin: gint = 65368

    public const val KEY_Blue: gint = 269025190

    public const val KEY_Bluetooth: gint = 269025172

    public const val KEY_Book: gint = 269025106

    public const val KEY_BounceKeys_Enable: gint = 65140

    public const val KEY_Break: gint = 65387

    public const val KEY_BrightnessAdjust: gint = 269025083

    public const val KEY_Byelorussian_SHORTU: gint = 1726

    public const val KEY_Byelorussian_shortu: gint = 1710

    public const val KEY_C: gint = 67

    public const val KEY_CD: gint = 269025107

    public const val KEY_CH: gint = 65186

    public const val KEY_C_H: gint = 65189

    public const val KEY_C_h: gint = 65188

    public const val KEY_Cabovedot: gint = 709

    public const val KEY_Cacute: gint = 454

    public const val KEY_Calculator: gint = 269025053

    public const val KEY_Calendar: gint = 269025056

    public const val KEY_Cancel: gint = 65385

    public const val KEY_Caps_Lock: gint = 65509

    public const val KEY_Ccaron: gint = 456

    public const val KEY_Ccedilla: gint = 199

    public const val KEY_Ccircumflex: gint = 710

    public const val KEY_Ch: gint = 65185

    public const val KEY_Clear: gint = 65291

    public const val KEY_ClearGrab: gint = 269024801

    public const val KEY_Close: gint = 269025110

    public const val KEY_Codeinput: gint = 65335

    public const val KEY_ColonSign: gint = 16785569

    public const val KEY_Community: gint = 269025085

    public const val KEY_ContrastAdjust: gint = 269025058

    public const val KEY_Control_L: gint = 65507

    public const val KEY_Control_R: gint = 65508

    public const val KEY_Copy: gint = 269025111

    public const val KEY_CruzeiroSign: gint = 16785570

    public const val KEY_Cut: gint = 269025112

    public const val KEY_CycleAngle: gint = 269025180

    public const val KEY_Cyrillic_A: gint = 1761

    public const val KEY_Cyrillic_BE: gint = 1762

    public const val KEY_Cyrillic_CHE: gint = 1790

    public const val KEY_Cyrillic_CHE_descender: gint = 16778422

    public const val KEY_Cyrillic_CHE_vertstroke: gint = 16778424

    public const val KEY_Cyrillic_DE: gint = 1764

    public const val KEY_Cyrillic_DZHE: gint = 1727

    public const val KEY_Cyrillic_E: gint = 1788

    public const val KEY_Cyrillic_EF: gint = 1766

    public const val KEY_Cyrillic_EL: gint = 1772

    public const val KEY_Cyrillic_EM: gint = 1773

    public const val KEY_Cyrillic_EN: gint = 1774

    public const val KEY_Cyrillic_EN_descender: gint = 16778402

    public const val KEY_Cyrillic_ER: gint = 1778

    public const val KEY_Cyrillic_ES: gint = 1779

    public const val KEY_Cyrillic_GHE: gint = 1767

    public const val KEY_Cyrillic_GHE_bar: gint = 16778386

    public const val KEY_Cyrillic_HA: gint = 1768

    public const val KEY_Cyrillic_HARDSIGN: gint = 1791

    public const val KEY_Cyrillic_HA_descender: gint = 16778418

    public const val KEY_Cyrillic_I: gint = 1769

    public const val KEY_Cyrillic_IE: gint = 1765

    public const val KEY_Cyrillic_IO: gint = 1715

    public const val KEY_Cyrillic_I_macron: gint = 16778466

    public const val KEY_Cyrillic_JE: gint = 1720

    public const val KEY_Cyrillic_KA: gint = 1771

    public const val KEY_Cyrillic_KA_descender: gint = 16778394

    public const val KEY_Cyrillic_KA_vertstroke: gint = 16778396

    public const val KEY_Cyrillic_LJE: gint = 1721

    public const val KEY_Cyrillic_NJE: gint = 1722

    public const val KEY_Cyrillic_O: gint = 1775

    public const val KEY_Cyrillic_O_bar: gint = 16778472

    public const val KEY_Cyrillic_PE: gint = 1776

    public const val KEY_Cyrillic_SCHWA: gint = 16778456

    public const val KEY_Cyrillic_SHA: gint = 1787

    public const val KEY_Cyrillic_SHCHA: gint = 1789

    public const val KEY_Cyrillic_SHHA: gint = 16778426

    public const val KEY_Cyrillic_SHORTI: gint = 1770

    public const val KEY_Cyrillic_SOFTSIGN: gint = 1784

    public const val KEY_Cyrillic_TE: gint = 1780

    public const val KEY_Cyrillic_TSE: gint = 1763

    public const val KEY_Cyrillic_U: gint = 1781

    public const val KEY_Cyrillic_U_macron: gint = 16778478

    public const val KEY_Cyrillic_U_straight: gint = 16778414

    public const val KEY_Cyrillic_U_straight_bar: gint = 16778416

    public const val KEY_Cyrillic_VE: gint = 1783

    public const val KEY_Cyrillic_YA: gint = 1777

    public const val KEY_Cyrillic_YERU: gint = 1785

    public const val KEY_Cyrillic_YU: gint = 1760

    public const val KEY_Cyrillic_ZE: gint = 1786

    public const val KEY_Cyrillic_ZHE: gint = 1782

    public const val KEY_Cyrillic_ZHE_descender: gint = 16778390

    public const val KEY_Cyrillic_a: gint = 1729

    public const val KEY_Cyrillic_be: gint = 1730

    public const val KEY_Cyrillic_che: gint = 1758

    public const val KEY_Cyrillic_che_descender: gint = 16778423

    public const val KEY_Cyrillic_che_vertstroke: gint = 16778425

    public const val KEY_Cyrillic_de: gint = 1732

    public const val KEY_Cyrillic_dzhe: gint = 1711

    public const val KEY_Cyrillic_e: gint = 1756

    public const val KEY_Cyrillic_ef: gint = 1734

    public const val KEY_Cyrillic_el: gint = 1740

    public const val KEY_Cyrillic_em: gint = 1741

    public const val KEY_Cyrillic_en: gint = 1742

    public const val KEY_Cyrillic_en_descender: gint = 16778403

    public const val KEY_Cyrillic_er: gint = 1746

    public const val KEY_Cyrillic_es: gint = 1747

    public const val KEY_Cyrillic_ghe: gint = 1735

    public const val KEY_Cyrillic_ghe_bar: gint = 16778387

    public const val KEY_Cyrillic_ha: gint = 1736

    public const val KEY_Cyrillic_ha_descender: gint = 16778419

    public const val KEY_Cyrillic_hardsign: gint = 1759

    public const val KEY_Cyrillic_i: gint = 1737

    public const val KEY_Cyrillic_i_macron: gint = 16778467

    public const val KEY_Cyrillic_ie: gint = 1733

    public const val KEY_Cyrillic_io: gint = 1699

    public const val KEY_Cyrillic_je: gint = 1704

    public const val KEY_Cyrillic_ka: gint = 1739

    public const val KEY_Cyrillic_ka_descender: gint = 16778395

    public const val KEY_Cyrillic_ka_vertstroke: gint = 16778397

    public const val KEY_Cyrillic_lje: gint = 1705

    public const val KEY_Cyrillic_nje: gint = 1706

    public const val KEY_Cyrillic_o: gint = 1743

    public const val KEY_Cyrillic_o_bar: gint = 16778473

    public const val KEY_Cyrillic_pe: gint = 1744

    public const val KEY_Cyrillic_schwa: gint = 16778457

    public const val KEY_Cyrillic_sha: gint = 1755

    public const val KEY_Cyrillic_shcha: gint = 1757

    public const val KEY_Cyrillic_shha: gint = 16778427

    public const val KEY_Cyrillic_shorti: gint = 1738

    public const val KEY_Cyrillic_softsign: gint = 1752

    public const val KEY_Cyrillic_te: gint = 1748

    public const val KEY_Cyrillic_tse: gint = 1731

    public const val KEY_Cyrillic_u: gint = 1749

    public const val KEY_Cyrillic_u_macron: gint = 16778479

    public const val KEY_Cyrillic_u_straight: gint = 16778415

    public const val KEY_Cyrillic_u_straight_bar: gint = 16778417

    public const val KEY_Cyrillic_ve: gint = 1751

    public const val KEY_Cyrillic_ya: gint = 1745

    public const val KEY_Cyrillic_yeru: gint = 1753

    public const val KEY_Cyrillic_yu: gint = 1728

    public const val KEY_Cyrillic_ze: gint = 1754

    public const val KEY_Cyrillic_zhe: gint = 1750

    public const val KEY_Cyrillic_zhe_descender: gint = 16778391

    public const val KEY_D: gint = 68

    public const val KEY_DOS: gint = 269025114

    public const val KEY_Dabovedot: gint = 16784906

    public const val KEY_Dcaron: gint = 463

    public const val KEY_Delete: gint = 65535

    public const val KEY_Display: gint = 269025113

    public const val KEY_Documents: gint = 269025115

    public const val KEY_DongSign: gint = 16785579

    public const val KEY_Down: gint = 65364

    public const val KEY_Dstroke: gint = 464

    public const val KEY_E: gint = 69

    public const val KEY_ENG: gint = 957

    public const val KEY_ETH: gint = 208

    public const val KEY_EZH: gint = 16777655

    public const val KEY_Eabovedot: gint = 972

    public const val KEY_Eacute: gint = 201

    public const val KEY_Ebelowdot: gint = 16785080

    public const val KEY_Ecaron: gint = 460

    public const val KEY_Ecircumflex: gint = 202

    public const val KEY_Ecircumflexacute: gint = 16785086

    public const val KEY_Ecircumflexbelowdot: gint = 16785094

    public const val KEY_Ecircumflexgrave: gint = 16785088

    public const val KEY_Ecircumflexhook: gint = 16785090

    public const val KEY_Ecircumflextilde: gint = 16785092

    public const val KEY_EcuSign: gint = 16785568

    public const val KEY_Ediaeresis: gint = 203

    public const val KEY_Egrave: gint = 200

    public const val KEY_Ehook: gint = 16785082

    public const val KEY_Eisu_Shift: gint = 65327

    public const val KEY_Eisu_toggle: gint = 65328

    public const val KEY_Eject: gint = 269025068

    public const val KEY_Emacron: gint = 938

    public const val KEY_End: gint = 65367

    public const val KEY_Eogonek: gint = 458

    public const val KEY_Escape: gint = 65307

    public const val KEY_Eth: gint = 208

    public const val KEY_Etilde: gint = 16785084

    public const val KEY_EuroSign: gint = 8364

    public const val KEY_Excel: gint = 269025116

    public const val KEY_Execute: gint = 65378

    public const val KEY_Explorer: gint = 269025117

    public const val KEY_F: gint = 70

    public const val KEY_F1: gint = 65470

    public const val KEY_F10: gint = 65479

    public const val KEY_F11: gint = 65480

    public const val KEY_F12: gint = 65481

    public const val KEY_F13: gint = 65482

    public const val KEY_F14: gint = 65483

    public const val KEY_F15: gint = 65484

    public const val KEY_F16: gint = 65485

    public const val KEY_F17: gint = 65486

    public const val KEY_F18: gint = 65487

    public const val KEY_F19: gint = 65488

    public const val KEY_F2: gint = 65471

    public const val KEY_F20: gint = 65489

    public const val KEY_F21: gint = 65490

    public const val KEY_F22: gint = 65491

    public const val KEY_F23: gint = 65492

    public const val KEY_F24: gint = 65493

    public const val KEY_F25: gint = 65494

    public const val KEY_F26: gint = 65495

    public const val KEY_F27: gint = 65496

    public const val KEY_F28: gint = 65497

    public const val KEY_F29: gint = 65498

    public const val KEY_F3: gint = 65472

    public const val KEY_F30: gint = 65499

    public const val KEY_F31: gint = 65500

    public const val KEY_F32: gint = 65501

    public const val KEY_F33: gint = 65502

    public const val KEY_F34: gint = 65503

    public const val KEY_F35: gint = 65504

    public const val KEY_F4: gint = 65473

    public const val KEY_F5: gint = 65474

    public const val KEY_F6: gint = 65475

    public const val KEY_F7: gint = 65476

    public const val KEY_F8: gint = 65477

    public const val KEY_F9: gint = 65478

    public const val KEY_FFrancSign: gint = 16785571

    public const val KEY_Fabovedot: gint = 16784926

    public const val KEY_Farsi_0: gint = 16778992

    public const val KEY_Farsi_1: gint = 16778993

    public const val KEY_Farsi_2: gint = 16778994

    public const val KEY_Farsi_3: gint = 16778995

    public const val KEY_Farsi_4: gint = 16778996

    public const val KEY_Farsi_5: gint = 16778997

    public const val KEY_Farsi_6: gint = 16778998

    public const val KEY_Farsi_7: gint = 16778999

    public const val KEY_Farsi_8: gint = 16779000

    public const val KEY_Farsi_9: gint = 16779001

    public const val KEY_Farsi_yeh: gint = 16778956

    public const val KEY_Favorites: gint = 269025072

    public const val KEY_Finance: gint = 269025084

    public const val KEY_Find: gint = 65384

    public const val KEY_First_Virtual_Screen: gint = 65232

    public const val KEY_Forward: gint = 269025063

    public const val KEY_FrameBack: gint = 269025181

    public const val KEY_FrameForward: gint = 269025182

    public const val KEY_G: gint = 71

    public const val KEY_Gabovedot: gint = 725

    public const val KEY_Game: gint = 269025118

    public const val KEY_Gbreve: gint = 683

    public const val KEY_Gcaron: gint = 16777702

    public const val KEY_Gcedilla: gint = 939

    public const val KEY_Gcircumflex: gint = 728

    public const val KEY_Georgian_an: gint = 16781520

    public const val KEY_Georgian_ban: gint = 16781521

    public const val KEY_Georgian_can: gint = 16781546

    public const val KEY_Georgian_char: gint = 16781549

    public const val KEY_Georgian_chin: gint = 16781545

    public const val KEY_Georgian_cil: gint = 16781548

    public const val KEY_Georgian_don: gint = 16781523

    public const val KEY_Georgian_en: gint = 16781524

    public const val KEY_Georgian_fi: gint = 16781558

    public const val KEY_Georgian_gan: gint = 16781522

    public const val KEY_Georgian_ghan: gint = 16781542

    public const val KEY_Georgian_hae: gint = 16781552

    public const val KEY_Georgian_har: gint = 16781556

    public const val KEY_Georgian_he: gint = 16781553

    public const val KEY_Georgian_hie: gint = 16781554

    public const val KEY_Georgian_hoe: gint = 16781557

    public const val KEY_Georgian_in: gint = 16781528

    public const val KEY_Georgian_jhan: gint = 16781551

    public const val KEY_Georgian_jil: gint = 16781547

    public const val KEY_Georgian_kan: gint = 16781529

    public const val KEY_Georgian_khar: gint = 16781541

    public const val KEY_Georgian_las: gint = 16781530

    public const val KEY_Georgian_man: gint = 16781531

    public const val KEY_Georgian_nar: gint = 16781532

    public const val KEY_Georgian_on: gint = 16781533

    public const val KEY_Georgian_par: gint = 16781534

    public const val KEY_Georgian_phar: gint = 16781540

    public const val KEY_Georgian_qar: gint = 16781543

    public const val KEY_Georgian_rae: gint = 16781536

    public const val KEY_Georgian_san: gint = 16781537

    public const val KEY_Georgian_shin: gint = 16781544

    public const val KEY_Georgian_tan: gint = 16781527

    public const val KEY_Georgian_tar: gint = 16781538

    public const val KEY_Georgian_un: gint = 16781539

    public const val KEY_Georgian_vin: gint = 16781525

    public const val KEY_Georgian_we: gint = 16781555

    public const val KEY_Georgian_xan: gint = 16781550

    public const val KEY_Georgian_zen: gint = 16781526

    public const val KEY_Georgian_zhar: gint = 16781535

    public const val KEY_Go: gint = 269025119

    public const val KEY_Greek_ALPHA: gint = 1985

    public const val KEY_Greek_ALPHAaccent: gint = 1953

    public const val KEY_Greek_BETA: gint = 1986

    public const val KEY_Greek_CHI: gint = 2007

    public const val KEY_Greek_DELTA: gint = 1988

    public const val KEY_Greek_EPSILON: gint = 1989

    public const val KEY_Greek_EPSILONaccent: gint = 1954

    public const val KEY_Greek_ETA: gint = 1991

    public const val KEY_Greek_ETAaccent: gint = 1955

    public const val KEY_Greek_GAMMA: gint = 1987

    public const val KEY_Greek_IOTA: gint = 1993

    public const val KEY_Greek_IOTAaccent: gint = 1956

    public const val KEY_Greek_IOTAdiaeresis: gint = 1957

    public const val KEY_Greek_IOTAdieresis: gint = 1957

    public const val KEY_Greek_KAPPA: gint = 1994

    public const val KEY_Greek_LAMBDA: gint = 1995

    public const val KEY_Greek_LAMDA: gint = 1995

    public const val KEY_Greek_MU: gint = 1996

    public const val KEY_Greek_NU: gint = 1997

    public const val KEY_Greek_OMEGA: gint = 2009

    public const val KEY_Greek_OMEGAaccent: gint = 1963

    public const val KEY_Greek_OMICRON: gint = 1999

    public const val KEY_Greek_OMICRONaccent: gint = 1959

    public const val KEY_Greek_PHI: gint = 2006

    public const val KEY_Greek_PI: gint = 2000

    public const val KEY_Greek_PSI: gint = 2008

    public const val KEY_Greek_RHO: gint = 2001

    public const val KEY_Greek_SIGMA: gint = 2002

    public const val KEY_Greek_TAU: gint = 2004

    public const val KEY_Greek_THETA: gint = 1992

    public const val KEY_Greek_UPSILON: gint = 2005

    public const val KEY_Greek_UPSILONaccent: gint = 1960

    public const val KEY_Greek_UPSILONdieresis: gint = 1961

    public const val KEY_Greek_XI: gint = 1998

    public const val KEY_Greek_ZETA: gint = 1990

    public const val KEY_Greek_accentdieresis: gint = 1966

    public const val KEY_Greek_alpha: gint = 2017

    public const val KEY_Greek_alphaaccent: gint = 1969

    public const val KEY_Greek_beta: gint = 2018

    public const val KEY_Greek_chi: gint = 2039

    public const val KEY_Greek_delta: gint = 2020

    public const val KEY_Greek_epsilon: gint = 2021

    public const val KEY_Greek_epsilonaccent: gint = 1970

    public const val KEY_Greek_eta: gint = 2023

    public const val KEY_Greek_etaaccent: gint = 1971

    public const val KEY_Greek_finalsmallsigma: gint = 2035

    public const val KEY_Greek_gamma: gint = 2019

    public const val KEY_Greek_horizbar: gint = 1967

    public const val KEY_Greek_iota: gint = 2025

    public const val KEY_Greek_iotaaccent: gint = 1972

    public const val KEY_Greek_iotaaccentdieresis: gint = 1974

    public const val KEY_Greek_iotadieresis: gint = 1973

    public const val KEY_Greek_kappa: gint = 2026

    public const val KEY_Greek_lambda: gint = 2027

    public const val KEY_Greek_lamda: gint = 2027

    public const val KEY_Greek_mu: gint = 2028

    public const val KEY_Greek_nu: gint = 2029

    public const val KEY_Greek_omega: gint = 2041

    public const val KEY_Greek_omegaaccent: gint = 1979

    public const val KEY_Greek_omicron: gint = 2031

    public const val KEY_Greek_omicronaccent: gint = 1975

    public const val KEY_Greek_phi: gint = 2038

    public const val KEY_Greek_pi: gint = 2032

    public const val KEY_Greek_psi: gint = 2040

    public const val KEY_Greek_rho: gint = 2033

    public const val KEY_Greek_sigma: gint = 2034

    public const val KEY_Greek_switch: gint = 65406

    public const val KEY_Greek_tau: gint = 2036

    public const val KEY_Greek_theta: gint = 2024

    public const val KEY_Greek_upsilon: gint = 2037

    public const val KEY_Greek_upsilonaccent: gint = 1976

    public const val KEY_Greek_upsilonaccentdieresis: gint = 1978

    public const val KEY_Greek_upsilondieresis: gint = 1977

    public const val KEY_Greek_xi: gint = 2030

    public const val KEY_Greek_zeta: gint = 2022

    public const val KEY_Green: gint = 269025188

    public const val KEY_H: gint = 72

    public const val KEY_Hangul: gint = 65329

    public const val KEY_Hangul_A: gint = 3775

    public const val KEY_Hangul_AE: gint = 3776

    public const val KEY_Hangul_AraeA: gint = 3830

    public const val KEY_Hangul_AraeAE: gint = 3831

    public const val KEY_Hangul_Banja: gint = 65337

    public const val KEY_Hangul_Cieuc: gint = 3770

    public const val KEY_Hangul_Codeinput: gint = 65335

    public const val KEY_Hangul_Dikeud: gint = 3751

    public const val KEY_Hangul_E: gint = 3780

    public const val KEY_Hangul_EO: gint = 3779

    public const val KEY_Hangul_EU: gint = 3793

    public const val KEY_Hangul_End: gint = 65331

    public const val KEY_Hangul_Hanja: gint = 65332

    public const val KEY_Hangul_Hieuh: gint = 3774

    public const val KEY_Hangul_I: gint = 3795

    public const val KEY_Hangul_Ieung: gint = 3767

    public const val KEY_Hangul_J_Cieuc: gint = 3818

    public const val KEY_Hangul_J_Dikeud: gint = 3802

    public const val KEY_Hangul_J_Hieuh: gint = 3822

    public const val KEY_Hangul_J_Ieung: gint = 3816

    public const val KEY_Hangul_J_Jieuj: gint = 3817

    public const val KEY_Hangul_J_Khieuq: gint = 3819

    public const val KEY_Hangul_J_Kiyeog: gint = 3796

    public const val KEY_Hangul_J_KiyeogSios: gint = 3798

    public const val KEY_Hangul_J_KkogjiDalrinIeung: gint = 3833

    public const val KEY_Hangul_J_Mieum: gint = 3811

    public const val KEY_Hangul_J_Nieun: gint = 3799

    public const val KEY_Hangul_J_NieunHieuh: gint = 3801

    public const val KEY_Hangul_J_NieunJieuj: gint = 3800

    public const val KEY_Hangul_J_PanSios: gint = 3832

    public const val KEY_Hangul_J_Phieuf: gint = 3821

    public const val KEY_Hangul_J_Pieub: gint = 3812

    public const val KEY_Hangul_J_PieubSios: gint = 3813

    public const val KEY_Hangul_J_Rieul: gint = 3803

    public const val KEY_Hangul_J_RieulHieuh: gint = 3810

    public const val KEY_Hangul_J_RieulKiyeog: gint = 3804

    public const val KEY_Hangul_J_RieulMieum: gint = 3805

    public const val KEY_Hangul_J_RieulPhieuf: gint = 3809

    public const val KEY_Hangul_J_RieulPieub: gint = 3806

    public const val KEY_Hangul_J_RieulSios: gint = 3807

    public const val KEY_Hangul_J_RieulTieut: gint = 3808

    public const val KEY_Hangul_J_Sios: gint = 3814

    public const val KEY_Hangul_J_SsangKiyeog: gint = 3797

    public const val KEY_Hangul_J_SsangSios: gint = 3815

    public const val KEY_Hangul_J_Tieut: gint = 3820

    public const val KEY_Hangul_J_YeorinHieuh: gint = 3834

    public const val KEY_Hangul_Jamo: gint = 65333

    public const val KEY_Hangul_Jeonja: gint = 65336

    public const val KEY_Hangul_Jieuj: gint = 3768

    public const val KEY_Hangul_Khieuq: gint = 3771

    public const val KEY_Hangul_Kiyeog: gint = 3745

    public const val KEY_Hangul_KiyeogSios: gint = 3747

    public const val KEY_Hangul_KkogjiDalrinIeung: gint = 3827

    public const val KEY_Hangul_Mieum: gint = 3761

    public const val KEY_Hangul_MultipleCandidate: gint = 65341

    public const val KEY_Hangul_Nieun: gint = 3748

    public const val KEY_Hangul_NieunHieuh: gint = 3750

    public const val KEY_Hangul_NieunJieuj: gint = 3749

    public const val KEY_Hangul_O: gint = 3783

    public const val KEY_Hangul_OE: gint = 3786

    public const val KEY_Hangul_PanSios: gint = 3826

    public const val KEY_Hangul_Phieuf: gint = 3773

    public const val KEY_Hangul_Pieub: gint = 3762

    public const val KEY_Hangul_PieubSios: gint = 3764

    public const val KEY_Hangul_PostHanja: gint = 65339

    public const val KEY_Hangul_PreHanja: gint = 65338

    public const val KEY_Hangul_PreviousCandidate: gint = 65342

    public const val KEY_Hangul_Rieul: gint = 3753

    public const val KEY_Hangul_RieulHieuh: gint = 3760

    public const val KEY_Hangul_RieulKiyeog: gint = 3754

    public const val KEY_Hangul_RieulMieum: gint = 3755

    public const val KEY_Hangul_RieulPhieuf: gint = 3759

    public const val KEY_Hangul_RieulPieub: gint = 3756

    public const val KEY_Hangul_RieulSios: gint = 3757

    public const val KEY_Hangul_RieulTieut: gint = 3758

    public const val KEY_Hangul_RieulYeorinHieuh: gint = 3823

    public const val KEY_Hangul_Romaja: gint = 65334

    public const val KEY_Hangul_SingleCandidate: gint = 65340

    public const val KEY_Hangul_Sios: gint = 3765

    public const val KEY_Hangul_Special: gint = 65343

    public const val KEY_Hangul_SsangDikeud: gint = 3752

    public const val KEY_Hangul_SsangJieuj: gint = 3769

    public const val KEY_Hangul_SsangKiyeog: gint = 3746

    public const val KEY_Hangul_SsangPieub: gint = 3763

    public const val KEY_Hangul_SsangSios: gint = 3766

    public const val KEY_Hangul_Start: gint = 65330

    public const val KEY_Hangul_SunkyeongeumMieum: gint = 3824

    public const val KEY_Hangul_SunkyeongeumPhieuf: gint = 3828

    public const val KEY_Hangul_SunkyeongeumPieub: gint = 3825

    public const val KEY_Hangul_Tieut: gint = 3772

    public const val KEY_Hangul_U: gint = 3788

    public const val KEY_Hangul_WA: gint = 3784

    public const val KEY_Hangul_WAE: gint = 3785

    public const val KEY_Hangul_WE: gint = 3790

    public const val KEY_Hangul_WEO: gint = 3789

    public const val KEY_Hangul_WI: gint = 3791

    public const val KEY_Hangul_YA: gint = 3777

    public const val KEY_Hangul_YAE: gint = 3778

    public const val KEY_Hangul_YE: gint = 3782

    public const val KEY_Hangul_YEO: gint = 3781

    public const val KEY_Hangul_YI: gint = 3794

    public const val KEY_Hangul_YO: gint = 3787

    public const val KEY_Hangul_YU: gint = 3792

    public const val KEY_Hangul_YeorinHieuh: gint = 3829

    public const val KEY_Hangul_switch: gint = 65406

    public const val KEY_Hankaku: gint = 65321

    public const val KEY_Hcircumflex: gint = 678

    public const val KEY_Hebrew_switch: gint = 65406

    public const val KEY_Help: gint = 65386

    public const val KEY_Henkan: gint = 65315

    public const val KEY_Henkan_Mode: gint = 65315

    public const val KEY_Hibernate: gint = 269025192

    public const val KEY_Hiragana: gint = 65317

    public const val KEY_Hiragana_Katakana: gint = 65319

    public const val KEY_History: gint = 269025079

    public const val KEY_Home: gint = 65360

    public const val KEY_HomePage: gint = 269025048

    public const val KEY_HotLinks: gint = 269025082

    public const val KEY_Hstroke: gint = 673

    public const val KEY_Hyper_L: gint = 65517

    public const val KEY_Hyper_R: gint = 65518

    public const val KEY_I: gint = 73

    public const val KEY_ISO_Center_Object: gint = 65075

    public const val KEY_ISO_Continuous_Underline: gint = 65072

    public const val KEY_ISO_Discontinuous_Underline: gint = 65073

    public const val KEY_ISO_Emphasize: gint = 65074

    public const val KEY_ISO_Enter: gint = 65076

    public const val KEY_ISO_Fast_Cursor_Down: gint = 65071

    public const val KEY_ISO_Fast_Cursor_Left: gint = 65068

    public const val KEY_ISO_Fast_Cursor_Right: gint = 65069

    public const val KEY_ISO_Fast_Cursor_Up: gint = 65070

    public const val KEY_ISO_First_Group: gint = 65036

    public const val KEY_ISO_First_Group_Lock: gint = 65037

    public const val KEY_ISO_Group_Latch: gint = 65030

    public const val KEY_ISO_Group_Lock: gint = 65031

    public const val KEY_ISO_Group_Shift: gint = 65406

    public const val KEY_ISO_Last_Group: gint = 65038

    public const val KEY_ISO_Last_Group_Lock: gint = 65039

    public const val KEY_ISO_Left_Tab: gint = 65056

    public const val KEY_ISO_Level2_Latch: gint = 65026

    public const val KEY_ISO_Level3_Latch: gint = 65028

    public const val KEY_ISO_Level3_Lock: gint = 65029

    public const val KEY_ISO_Level3_Shift: gint = 65027

    public const val KEY_ISO_Level5_Latch: gint = 65042

    public const val KEY_ISO_Level5_Lock: gint = 65043

    public const val KEY_ISO_Level5_Shift: gint = 65041

    public const val KEY_ISO_Lock: gint = 65025

    public const val KEY_ISO_Move_Line_Down: gint = 65058

    public const val KEY_ISO_Move_Line_Up: gint = 65057

    public const val KEY_ISO_Next_Group: gint = 65032

    public const val KEY_ISO_Next_Group_Lock: gint = 65033

    public const val KEY_ISO_Partial_Line_Down: gint = 65060

    public const val KEY_ISO_Partial_Line_Up: gint = 65059

    public const val KEY_ISO_Partial_Space_Left: gint = 65061

    public const val KEY_ISO_Partial_Space_Right: gint = 65062

    public const val KEY_ISO_Prev_Group: gint = 65034

    public const val KEY_ISO_Prev_Group_Lock: gint = 65035

    public const val KEY_ISO_Release_Both_Margins: gint = 65067

    public const val KEY_ISO_Release_Margin_Left: gint = 65065

    public const val KEY_ISO_Release_Margin_Right: gint = 65066

    public const val KEY_ISO_Set_Margin_Left: gint = 65063

    public const val KEY_ISO_Set_Margin_Right: gint = 65064

    public const val KEY_Iabovedot: gint = 681

    public const val KEY_Iacute: gint = 205

    public const val KEY_Ibelowdot: gint = 16785098

    public const val KEY_Ibreve: gint = 16777516

    public const val KEY_Icircumflex: gint = 206

    public const val KEY_Idiaeresis: gint = 207

    public const val KEY_Igrave: gint = 204

    public const val KEY_Ihook: gint = 16785096

    public const val KEY_Imacron: gint = 975

    public const val KEY_Insert: gint = 65379

    public const val KEY_Iogonek: gint = 967

    public const val KEY_Itilde: gint = 933

    public const val KEY_J: gint = 74

    public const val KEY_Jcircumflex: gint = 684

    public const val KEY_K: gint = 75

    public const val KEY_KP_0: gint = 65456

    public const val KEY_KP_1: gint = 65457

    public const val KEY_KP_2: gint = 65458

    public const val KEY_KP_3: gint = 65459

    public const val KEY_KP_4: gint = 65460

    public const val KEY_KP_5: gint = 65461

    public const val KEY_KP_6: gint = 65462

    public const val KEY_KP_7: gint = 65463

    public const val KEY_KP_8: gint = 65464

    public const val KEY_KP_9: gint = 65465

    public const val KEY_KP_Add: gint = 65451

    public const val KEY_KP_Begin: gint = 65437

    public const val KEY_KP_Decimal: gint = 65454

    public const val KEY_KP_Delete: gint = 65439

    public const val KEY_KP_Divide: gint = 65455

    public const val KEY_KP_Down: gint = 65433

    public const val KEY_KP_End: gint = 65436

    public const val KEY_KP_Enter: gint = 65421

    public const val KEY_KP_Equal: gint = 65469

    public const val KEY_KP_F1: gint = 65425

    public const val KEY_KP_F2: gint = 65426

    public const val KEY_KP_F3: gint = 65427

    public const val KEY_KP_F4: gint = 65428

    public const val KEY_KP_Home: gint = 65429

    public const val KEY_KP_Insert: gint = 65438

    public const val KEY_KP_Left: gint = 65430

    public const val KEY_KP_Multiply: gint = 65450

    public const val KEY_KP_Next: gint = 65435

    public const val KEY_KP_Page_Down: gint = 65435

    public const val KEY_KP_Page_Up: gint = 65434

    public const val KEY_KP_Prior: gint = 65434

    public const val KEY_KP_Right: gint = 65432

    public const val KEY_KP_Separator: gint = 65452

    public const val KEY_KP_Space: gint = 65408

    public const val KEY_KP_Subtract: gint = 65453

    public const val KEY_KP_Tab: gint = 65417

    public const val KEY_KP_Up: gint = 65431

    public const val KEY_Kana_Lock: gint = 65325

    public const val KEY_Kana_Shift: gint = 65326

    public const val KEY_Kanji: gint = 65313

    public const val KEY_Kanji_Bangou: gint = 65335

    public const val KEY_Katakana: gint = 65318

    public const val KEY_KbdBrightnessDown: gint = 269025030

    public const val KEY_KbdBrightnessUp: gint = 269025029

    public const val KEY_KbdLightOnOff: gint = 269025028

    public const val KEY_Kcedilla: gint = 979

    public const val KEY_Keyboard: gint = 269025203

    public const val KEY_Korean_Won: gint = 3839

    public const val KEY_L: gint = 76

    public const val KEY_L1: gint = 65480

    public const val KEY_L10: gint = 65489

    public const val KEY_L2: gint = 65481

    public const val KEY_L3: gint = 65482

    public const val KEY_L4: gint = 65483

    public const val KEY_L5: gint = 65484

    public const val KEY_L6: gint = 65485

    public const val KEY_L7: gint = 65486

    public const val KEY_L8: gint = 65487

    public const val KEY_L9: gint = 65488

    public const val KEY_Lacute: gint = 453

    public const val KEY_Last_Virtual_Screen: gint = 65236

    public const val KEY_Launch0: gint = 269025088

    public const val KEY_Launch1: gint = 269025089

    public const val KEY_Launch2: gint = 269025090

    public const val KEY_Launch3: gint = 269025091

    public const val KEY_Launch4: gint = 269025092

    public const val KEY_Launch5: gint = 269025093

    public const val KEY_Launch6: gint = 269025094

    public const val KEY_Launch7: gint = 269025095

    public const val KEY_Launch8: gint = 269025096

    public const val KEY_Launch9: gint = 269025097

    public const val KEY_LaunchA: gint = 269025098

    public const val KEY_LaunchB: gint = 269025099

    public const val KEY_LaunchC: gint = 269025100

    public const val KEY_LaunchD: gint = 269025101

    public const val KEY_LaunchE: gint = 269025102

    public const val KEY_LaunchF: gint = 269025103

    public const val KEY_Lbelowdot: gint = 16784950

    public const val KEY_Lcaron: gint = 421

    public const val KEY_Lcedilla: gint = 934

    public const val KEY_Left: gint = 65361

    public const val KEY_LightBulb: gint = 269025077

    public const val KEY_Linefeed: gint = 65290

    public const val KEY_LiraSign: gint = 16785572

    public const val KEY_LogGrabInfo: gint = 269024805

    public const val KEY_LogOff: gint = 269025121

    public const val KEY_LogWindowTree: gint = 269024804

    public const val KEY_Lstroke: gint = 419

    public const val KEY_M: gint = 77

    public const val KEY_Mabovedot: gint = 16784960

    public const val KEY_Macedonia_DSE: gint = 1717

    public const val KEY_Macedonia_GJE: gint = 1714

    public const val KEY_Macedonia_KJE: gint = 1724

    public const val KEY_Macedonia_dse: gint = 1701

    public const val KEY_Macedonia_gje: gint = 1698

    public const val KEY_Macedonia_kje: gint = 1708

    public const val KEY_Mae_Koho: gint = 65342

    public const val KEY_Mail: gint = 269025049

    public const val KEY_MailForward: gint = 269025168

    public const val KEY_Market: gint = 269025122

    public const val KEY_Massyo: gint = 65324

    public const val KEY_Meeting: gint = 269025123

    public const val KEY_Memo: gint = 269025054

    public const val KEY_Menu: gint = 65383

    public const val KEY_MenuKB: gint = 269025125

    public const val KEY_MenuPB: gint = 269025126

    public const val KEY_Messenger: gint = 269025166

    public const val KEY_Meta_L: gint = 65511

    public const val KEY_Meta_R: gint = 65512

    public const val KEY_MillSign: gint = 16785573

    public const val KEY_ModeLock: gint = 269025025

    public const val KEY_Mode_switch: gint = 65406

    public const val KEY_MonBrightnessDown: gint = 269025027

    public const val KEY_MonBrightnessUp: gint = 269025026

    public const val KEY_MouseKeys_Accel_Enable: gint = 65143

    public const val KEY_MouseKeys_Enable: gint = 65142

    public const val KEY_Muhenkan: gint = 65314

    public const val KEY_Multi_key: gint = 65312

    public const val KEY_MultipleCandidate: gint = 65341

    public const val KEY_Music: gint = 269025170

    public const val KEY_MyComputer: gint = 269025075

    public const val KEY_MySites: gint = 269025127

    public const val KEY_N: gint = 78

    public const val KEY_Nacute: gint = 465

    public const val KEY_NairaSign: gint = 16785574

    public const val KEY_Ncaron: gint = 466

    public const val KEY_Ncedilla: gint = 977

    public const val KEY_New: gint = 269025128

    public const val KEY_NewSheqelSign: gint = 16785578

    public const val KEY_News: gint = 269025129

    public const val KEY_Next: gint = 65366

    public const val KEY_Next_VMode: gint = 269024802

    public const val KEY_Next_Virtual_Screen: gint = 65234

    public const val KEY_Ntilde: gint = 209

    public const val KEY_Num_Lock: gint = 65407

    public const val KEY_O: gint = 79

    public const val KEY_OE: gint = 5052

    public const val KEY_Oacute: gint = 211

    public const val KEY_Obarred: gint = 16777631

    public const val KEY_Obelowdot: gint = 16785100

    public const val KEY_Ocaron: gint = 16777681

    public const val KEY_Ocircumflex: gint = 212

    public const val KEY_Ocircumflexacute: gint = 16785104

    public const val KEY_Ocircumflexbelowdot: gint = 16785112

    public const val KEY_Ocircumflexgrave: gint = 16785106

    public const val KEY_Ocircumflexhook: gint = 16785108

    public const val KEY_Ocircumflextilde: gint = 16785110

    public const val KEY_Odiaeresis: gint = 214

    public const val KEY_Odoubleacute: gint = 469

    public const val KEY_OfficeHome: gint = 269025130

    public const val KEY_Ograve: gint = 210

    public const val KEY_Ohook: gint = 16785102

    public const val KEY_Ohorn: gint = 16777632

    public const val KEY_Ohornacute: gint = 16785114

    public const val KEY_Ohornbelowdot: gint = 16785122

    public const val KEY_Ohorngrave: gint = 16785116

    public const val KEY_Ohornhook: gint = 16785118

    public const val KEY_Ohorntilde: gint = 16785120

    public const val KEY_Omacron: gint = 978

    public const val KEY_Ooblique: gint = 216

    public const val KEY_Open: gint = 269025131

    public const val KEY_OpenURL: gint = 269025080

    public const val KEY_Option: gint = 269025132

    public const val KEY_Oslash: gint = 216

    public const val KEY_Otilde: gint = 213

    public const val KEY_Overlay1_Enable: gint = 65144

    public const val KEY_Overlay2_Enable: gint = 65145

    public const val KEY_P: gint = 80

    public const val KEY_Pabovedot: gint = 16784982

    public const val KEY_Page_Down: gint = 65366

    public const val KEY_Page_Up: gint = 65365

    public const val KEY_Paste: gint = 269025133

    public const val KEY_Pause: gint = 65299

    public const val KEY_PesetaSign: gint = 16785575

    public const val KEY_Phone: gint = 269025134

    public const val KEY_Pictures: gint = 269025169

    public const val KEY_Pointer_Accelerate: gint = 65274

    public const val KEY_Pointer_Button1: gint = 65257

    public const val KEY_Pointer_Button2: gint = 65258

    public const val KEY_Pointer_Button3: gint = 65259

    public const val KEY_Pointer_Button4: gint = 65260

    public const val KEY_Pointer_Button5: gint = 65261

    public const val KEY_Pointer_Button_Dflt: gint = 65256

    public const val KEY_Pointer_DblClick1: gint = 65263

    public const val KEY_Pointer_DblClick2: gint = 65264

    public const val KEY_Pointer_DblClick3: gint = 65265

    public const val KEY_Pointer_DblClick4: gint = 65266

    public const val KEY_Pointer_DblClick5: gint = 65267

    public const val KEY_Pointer_DblClick_Dflt: gint = 65262

    public const val KEY_Pointer_DfltBtnNext: gint = 65275

    public const val KEY_Pointer_DfltBtnPrev: gint = 65276

    public const val KEY_Pointer_Down: gint = 65251

    public const val KEY_Pointer_DownLeft: gint = 65254

    public const val KEY_Pointer_DownRight: gint = 65255

    public const val KEY_Pointer_Drag1: gint = 65269

    public const val KEY_Pointer_Drag2: gint = 65270

    public const val KEY_Pointer_Drag3: gint = 65271

    public const val KEY_Pointer_Drag4: gint = 65272

    public const val KEY_Pointer_Drag5: gint = 65277

    public const val KEY_Pointer_Drag_Dflt: gint = 65268

    public const val KEY_Pointer_EnableKeys: gint = 65273

    public const val KEY_Pointer_Left: gint = 65248

    public const val KEY_Pointer_Right: gint = 65249

    public const val KEY_Pointer_Up: gint = 65250

    public const val KEY_Pointer_UpLeft: gint = 65252

    public const val KEY_Pointer_UpRight: gint = 65253

    public const val KEY_PowerDown: gint = 269025057

    public const val KEY_PowerOff: gint = 269025066

    public const val KEY_Prev_VMode: gint = 269024803

    public const val KEY_Prev_Virtual_Screen: gint = 65233

    public const val KEY_PreviousCandidate: gint = 65342

    public const val KEY_Print: gint = 65377

    public const val KEY_Prior: gint = 65365

    public const val KEY_Q: gint = 81

    public const val KEY_R: gint = 82

    public const val KEY_R1: gint = 65490

    public const val KEY_R10: gint = 65499

    public const val KEY_R11: gint = 65500

    public const val KEY_R12: gint = 65501

    public const val KEY_R13: gint = 65502

    public const val KEY_R14: gint = 65503

    public const val KEY_R15: gint = 65504

    public const val KEY_R2: gint = 65491

    public const val KEY_R3: gint = 65492

    public const val KEY_R4: gint = 65493

    public const val KEY_R5: gint = 65494

    public const val KEY_R6: gint = 65495

    public const val KEY_R7: gint = 65496

    public const val KEY_R8: gint = 65497

    public const val KEY_R9: gint = 65498

    public const val KEY_RFKill: gint = 269025205

    public const val KEY_Racute: gint = 448

    public const val KEY_Rcaron: gint = 472

    public const val KEY_Rcedilla: gint = 931

    public const val KEY_Red: gint = 269025187

    public const val KEY_Redo: gint = 65382

    public const val KEY_Refresh: gint = 269025065

    public const val KEY_Reload: gint = 269025139

    public const val KEY_RepeatKeys_Enable: gint = 65138

    public const val KEY_Reply: gint = 269025138

    public const val KEY_Return: gint = 65293

    public const val KEY_Right: gint = 65363

    public const val KEY_RockerDown: gint = 269025060

    public const val KEY_RockerEnter: gint = 269025061

    public const val KEY_RockerUp: gint = 269025059

    public const val KEY_Romaji: gint = 65316

    public const val KEY_RotateWindows: gint = 269025140

    public const val KEY_RotationKB: gint = 269025142

    public const val KEY_RotationPB: gint = 269025141

    public const val KEY_RupeeSign: gint = 16785576

    public const val KEY_S: gint = 83

    public const val KEY_SCHWA: gint = 16777615

    public const val KEY_Sabovedot: gint = 16784992

    public const val KEY_Sacute: gint = 422

    public const val KEY_Save: gint = 269025143

    public const val KEY_Scaron: gint = 425

    public const val KEY_Scedilla: gint = 426

    public const val KEY_Scircumflex: gint = 734

    public const val KEY_ScreenSaver: gint = 269025069

    public const val KEY_ScrollClick: gint = 269025146

    public const val KEY_ScrollDown: gint = 269025145

    public const val KEY_ScrollUp: gint = 269025144

    public const val KEY_Scroll_Lock: gint = 65300

    public const val KEY_Search: gint = 269025051

    public const val KEY_Select: gint = 65376

    public const val KEY_SelectButton: gint = 269025184

    public const val KEY_Send: gint = 269025147

    public const val KEY_Serbian_DJE: gint = 1713

    public const val KEY_Serbian_DZE: gint = 1727

    public const val KEY_Serbian_JE: gint = 1720

    public const val KEY_Serbian_LJE: gint = 1721

    public const val KEY_Serbian_NJE: gint = 1722

    public const val KEY_Serbian_TSHE: gint = 1723

    public const val KEY_Serbian_dje: gint = 1697

    public const val KEY_Serbian_dze: gint = 1711

    public const val KEY_Serbian_je: gint = 1704

    public const val KEY_Serbian_lje: gint = 1705

    public const val KEY_Serbian_nje: gint = 1706

    public const val KEY_Serbian_tshe: gint = 1707

    public const val KEY_Shift_L: gint = 65505

    public const val KEY_Shift_Lock: gint = 65510

    public const val KEY_Shift_R: gint = 65506

    public const val KEY_Shop: gint = 269025078

    public const val KEY_SingleCandidate: gint = 65340

    public const val KEY_Sinh_a: gint = 16780677

    public const val KEY_Sinh_aa: gint = 16780678

    public const val KEY_Sinh_aa2: gint = 16780751

    public const val KEY_Sinh_ae: gint = 16780679

    public const val KEY_Sinh_ae2: gint = 16780752

    public const val KEY_Sinh_aee: gint = 16780680

    public const val KEY_Sinh_aee2: gint = 16780753

    public const val KEY_Sinh_ai: gint = 16780691

    public const val KEY_Sinh_ai2: gint = 16780763

    public const val KEY_Sinh_al: gint = 16780746

    public const val KEY_Sinh_au: gint = 16780694

    public const val KEY_Sinh_au2: gint = 16780766

    public const val KEY_Sinh_ba: gint = 16780726

    public const val KEY_Sinh_bha: gint = 16780727

    public const val KEY_Sinh_ca: gint = 16780704

    public const val KEY_Sinh_cha: gint = 16780705

    public const val KEY_Sinh_dda: gint = 16780713

    public const val KEY_Sinh_ddha: gint = 16780714

    public const val KEY_Sinh_dha: gint = 16780719

    public const val KEY_Sinh_dhha: gint = 16780720

    public const val KEY_Sinh_e: gint = 16780689

    public const val KEY_Sinh_e2: gint = 16780761

    public const val KEY_Sinh_ee: gint = 16780690

    public const val KEY_Sinh_ee2: gint = 16780762

    public const val KEY_Sinh_fa: gint = 16780742

    public const val KEY_Sinh_ga: gint = 16780700

    public const val KEY_Sinh_gha: gint = 16780701

    public const val KEY_Sinh_h2: gint = 16780675

    public const val KEY_Sinh_ha: gint = 16780740

    public const val KEY_Sinh_i: gint = 16780681

    public const val KEY_Sinh_i2: gint = 16780754

    public const val KEY_Sinh_ii: gint = 16780682

    public const val KEY_Sinh_ii2: gint = 16780755

    public const val KEY_Sinh_ja: gint = 16780706

    public const val KEY_Sinh_jha: gint = 16780707

    public const val KEY_Sinh_jnya: gint = 16780709

    public const val KEY_Sinh_ka: gint = 16780698

    public const val KEY_Sinh_kha: gint = 16780699

    public const val KEY_Sinh_kunddaliya: gint = 16780788

    public const val KEY_Sinh_la: gint = 16780733

    public const val KEY_Sinh_lla: gint = 16780741

    public const val KEY_Sinh_lu: gint = 16780687

    public const val KEY_Sinh_lu2: gint = 16780767

    public const val KEY_Sinh_luu: gint = 16780688

    public const val KEY_Sinh_luu2: gint = 16780787

    public const val KEY_Sinh_ma: gint = 16780728

    public const val KEY_Sinh_mba: gint = 16780729

    public const val KEY_Sinh_na: gint = 16780721

    public const val KEY_Sinh_ndda: gint = 16780716

    public const val KEY_Sinh_ndha: gint = 16780723

    public const val KEY_Sinh_ng: gint = 16780674

    public const val KEY_Sinh_ng2: gint = 16780702

    public const val KEY_Sinh_nga: gint = 16780703

    public const val KEY_Sinh_nja: gint = 16780710

    public const val KEY_Sinh_nna: gint = 16780715

    public const val KEY_Sinh_nya: gint = 16780708

    public const val KEY_Sinh_o: gint = 16780692

    public const val KEY_Sinh_o2: gint = 16780764

    public const val KEY_Sinh_oo: gint = 16780693

    public const val KEY_Sinh_oo2: gint = 16780765

    public const val KEY_Sinh_pa: gint = 16780724

    public const val KEY_Sinh_pha: gint = 16780725

    public const val KEY_Sinh_ra: gint = 16780731

    public const val KEY_Sinh_ri: gint = 16780685

    public const val KEY_Sinh_rii: gint = 16780686

    public const val KEY_Sinh_ru2: gint = 16780760

    public const val KEY_Sinh_ruu2: gint = 16780786

    public const val KEY_Sinh_sa: gint = 16780739

    public const val KEY_Sinh_sha: gint = 16780737

    public const val KEY_Sinh_ssha: gint = 16780738

    public const val KEY_Sinh_tha: gint = 16780717

    public const val KEY_Sinh_thha: gint = 16780718

    public const val KEY_Sinh_tta: gint = 16780711

    public const val KEY_Sinh_ttha: gint = 16780712

    public const val KEY_Sinh_u: gint = 16780683

    public const val KEY_Sinh_u2: gint = 16780756

    public const val KEY_Sinh_uu: gint = 16780684

    public const val KEY_Sinh_uu2: gint = 16780758

    public const val KEY_Sinh_va: gint = 16780736

    public const val KEY_Sinh_ya: gint = 16780730

    public const val KEY_Sleep: gint = 269025071

    public const val KEY_SlowKeys_Enable: gint = 65139

    public const val KEY_Spell: gint = 269025148

    public const val KEY_SplitScreen: gint = 269025149

    public const val KEY_Standby: gint = 269025040

    public const val KEY_Start: gint = 269025050

    public const val KEY_StickyKeys_Enable: gint = 65141

    public const val KEY_Stop: gint = 269025064

    public const val KEY_Subtitle: gint = 269025178

    public const val KEY_Super_L: gint = 65515

    public const val KEY_Super_R: gint = 65516

    public const val KEY_Support: gint = 269025150

    public const val KEY_Suspend: gint = 269025191

    public const val KEY_Switch_VT_1: gint = 269024769

    public const val KEY_Switch_VT_10: gint = 269024778

    public const val KEY_Switch_VT_11: gint = 269024779

    public const val KEY_Switch_VT_12: gint = 269024780

    public const val KEY_Switch_VT_2: gint = 269024770

    public const val KEY_Switch_VT_3: gint = 269024771

    public const val KEY_Switch_VT_4: gint = 269024772

    public const val KEY_Switch_VT_5: gint = 269024773

    public const val KEY_Switch_VT_6: gint = 269024774

    public const val KEY_Switch_VT_7: gint = 269024775

    public const val KEY_Switch_VT_8: gint = 269024776

    public const val KEY_Switch_VT_9: gint = 269024777

    public const val KEY_Sys_Req: gint = 65301

    public const val KEY_T: gint = 84

    public const val KEY_THORN: gint = 222

    public const val KEY_Tab: gint = 65289

    public const val KEY_Tabovedot: gint = 16785002

    public const val KEY_TaskPane: gint = 269025151

    public const val KEY_Tcaron: gint = 427

    public const val KEY_Tcedilla: gint = 478

    public const val KEY_Terminal: gint = 269025152

    public const val KEY_Terminate_Server: gint = 65237

    public const val KEY_Thai_baht: gint = 3551

    public const val KEY_Thai_bobaimai: gint = 3514

    public const val KEY_Thai_chochan: gint = 3496

    public const val KEY_Thai_chochang: gint = 3498

    public const val KEY_Thai_choching: gint = 3497

    public const val KEY_Thai_chochoe: gint = 3500

    public const val KEY_Thai_dochada: gint = 3502

    public const val KEY_Thai_dodek: gint = 3508

    public const val KEY_Thai_fofa: gint = 3517

    public const val KEY_Thai_fofan: gint = 3519

    public const val KEY_Thai_hohip: gint = 3531

    public const val KEY_Thai_honokhuk: gint = 3534

    public const val KEY_Thai_khokhai: gint = 3490

    public const val KEY_Thai_khokhon: gint = 3493

    public const val KEY_Thai_khokhuat: gint = 3491

    public const val KEY_Thai_khokhwai: gint = 3492

    public const val KEY_Thai_khorakhang: gint = 3494

    public const val KEY_Thai_kokai: gint = 3489

    public const val KEY_Thai_lakkhangyao: gint = 3557

    public const val KEY_Thai_lekchet: gint = 3575

    public const val KEY_Thai_lekha: gint = 3573

    public const val KEY_Thai_lekhok: gint = 3574

    public const val KEY_Thai_lekkao: gint = 3577

    public const val KEY_Thai_leknung: gint = 3569

    public const val KEY_Thai_lekpaet: gint = 3576

    public const val KEY_Thai_leksam: gint = 3571

    public const val KEY_Thai_leksi: gint = 3572

    public const val KEY_Thai_leksong: gint = 3570

    public const val KEY_Thai_leksun: gint = 3568

    public const val KEY_Thai_lochula: gint = 3532

    public const val KEY_Thai_loling: gint = 3525

    public const val KEY_Thai_lu: gint = 3526

    public const val KEY_Thai_maichattawa: gint = 3563

    public const val KEY_Thai_maiek: gint = 3560

    public const val KEY_Thai_maihanakat: gint = 3537

    public const val KEY_Thai_maihanakat_maitho: gint = 3550

    public const val KEY_Thai_maitaikhu: gint = 3559

    public const val KEY_Thai_maitho: gint = 3561

    public const val KEY_Thai_maitri: gint = 3562

    public const val KEY_Thai_maiyamok: gint = 3558

    public const val KEY_Thai_moma: gint = 3521

    public const val KEY_Thai_ngongu: gint = 3495

    public const val KEY_Thai_nikhahit: gint = 3565

    public const val KEY_Thai_nonen: gint = 3507

    public const val KEY_Thai_nonu: gint = 3513

    public const val KEY_Thai_oang: gint = 3533

    public const val KEY_Thai_paiyannoi: gint = 3535

    public const val KEY_Thai_phinthu: gint = 3546

    public const val KEY_Thai_phophan: gint = 3518

    public const val KEY_Thai_phophung: gint = 3516

    public const val KEY_Thai_phosamphao: gint = 3520

    public const val KEY_Thai_popla: gint = 3515

    public const val KEY_Thai_rorua: gint = 3523

    public const val KEY_Thai_ru: gint = 3524

    public const val KEY_Thai_saraa: gint = 3536

    public const val KEY_Thai_saraaa: gint = 3538

    public const val KEY_Thai_saraae: gint = 3553

    public const val KEY_Thai_saraaimaimalai: gint = 3556

    public const val KEY_Thai_saraaimaimuan: gint = 3555

    public const val KEY_Thai_saraam: gint = 3539

    public const val KEY_Thai_sarae: gint = 3552

    public const val KEY_Thai_sarai: gint = 3540

    public const val KEY_Thai_saraii: gint = 3541

    public const val KEY_Thai_sarao: gint = 3554

    public const val KEY_Thai_sarau: gint = 3544

    public const val KEY_Thai_saraue: gint = 3542

    public const val KEY_Thai_sarauee: gint = 3543

    public const val KEY_Thai_sarauu: gint = 3545

    public const val KEY_Thai_sorusi: gint = 3529

    public const val KEY_Thai_sosala: gint = 3528

    public const val KEY_Thai_soso: gint = 3499

    public const val KEY_Thai_sosua: gint = 3530

    public const val KEY_Thai_thanthakhat: gint = 3564

    public const val KEY_Thai_thonangmontho: gint = 3505

    public const val KEY_Thai_thophuthao: gint = 3506

    public const val KEY_Thai_thothahan: gint = 3511

    public const val KEY_Thai_thothan: gint = 3504

    public const val KEY_Thai_thothong: gint = 3512

    public const val KEY_Thai_thothung: gint = 3510

    public const val KEY_Thai_topatak: gint = 3503

    public const val KEY_Thai_totao: gint = 3509

    public const val KEY_Thai_wowaen: gint = 3527

    public const val KEY_Thai_yoyak: gint = 3522

    public const val KEY_Thai_yoying: gint = 3501

    public const val KEY_Thorn: gint = 222

    public const val KEY_Time: gint = 269025183

    public const val KEY_ToDoList: gint = 269025055

    public const val KEY_Tools: gint = 269025153

    public const val KEY_TopMenu: gint = 269025186

    public const val KEY_TouchpadOff: gint = 269025201

    public const val KEY_TouchpadOn: gint = 269025200

    public const val KEY_TouchpadToggle: gint = 269025193

    public const val KEY_Touroku: gint = 65323

    public const val KEY_Travel: gint = 269025154

    public const val KEY_Tslash: gint = 940

    public const val KEY_U: gint = 85

    public const val KEY_UWB: gint = 269025174

    public const val KEY_Uacute: gint = 218

    public const val KEY_Ubelowdot: gint = 16785124

    public const val KEY_Ubreve: gint = 733

    public const val KEY_Ucircumflex: gint = 219

    public const val KEY_Udiaeresis: gint = 220

    public const val KEY_Udoubleacute: gint = 475

    public const val KEY_Ugrave: gint = 217

    public const val KEY_Uhook: gint = 16785126

    public const val KEY_Uhorn: gint = 16777647

    public const val KEY_Uhornacute: gint = 16785128

    public const val KEY_Uhornbelowdot: gint = 16785136

    public const val KEY_Uhorngrave: gint = 16785130

    public const val KEY_Uhornhook: gint = 16785132

    public const val KEY_Uhorntilde: gint = 16785134

    public const val KEY_Ukrainian_GHE_WITH_UPTURN: gint = 1725

    public const val KEY_Ukrainian_I: gint = 1718

    public const val KEY_Ukrainian_IE: gint = 1716

    public const val KEY_Ukrainian_YI: gint = 1719

    public const val KEY_Ukrainian_ghe_with_upturn: gint = 1709

    public const val KEY_Ukrainian_i: gint = 1702

    public const val KEY_Ukrainian_ie: gint = 1700

    public const val KEY_Ukrainian_yi: gint = 1703

    public const val KEY_Ukranian_I: gint = 1718

    public const val KEY_Ukranian_JE: gint = 1716

    public const val KEY_Ukranian_YI: gint = 1719

    public const val KEY_Ukranian_i: gint = 1702

    public const val KEY_Ukranian_je: gint = 1700

    public const val KEY_Ukranian_yi: gint = 1703

    public const val KEY_Umacron: gint = 990

    public const val KEY_Undo: gint = 65381

    public const val KEY_Ungrab: gint = 269024800

    public const val KEY_Uogonek: gint = 985

    public const val KEY_Up: gint = 65362

    public const val KEY_Uring: gint = 473

    public const val KEY_User1KB: gint = 269025157

    public const val KEY_User2KB: gint = 269025158

    public const val KEY_UserPB: gint = 269025156

    public const val KEY_Utilde: gint = 989

    public const val KEY_V: gint = 86

    public const val KEY_VendorHome: gint = 269025076

    public const val KEY_Video: gint = 269025159

    public const val KEY_View: gint = 269025185

    public const val KEY_VoidSymbol: gint = 16777215

    public const val KEY_W: gint = 87

    public const val KEY_WLAN: gint = 269025173

    public const val KEY_WWAN: gint = 269025204

    public const val KEY_WWW: gint = 269025070

    public const val KEY_Wacute: gint = 16785026

    public const val KEY_WakeUp: gint = 269025067

    public const val KEY_Wcircumflex: gint = 16777588

    public const val KEY_Wdiaeresis: gint = 16785028

    public const val KEY_WebCam: gint = 269025167

    public const val KEY_Wgrave: gint = 16785024

    public const val KEY_WheelButton: gint = 269025160

    public const val KEY_WindowClear: gint = 269025109

    public const val KEY_WonSign: gint = 16785577

    public const val KEY_Word: gint = 269025161

    public const val KEY_X: gint = 88

    public const val KEY_Xabovedot: gint = 16785034

    public const val KEY_Xfer: gint = 269025162

    public const val KEY_Y: gint = 89

    public const val KEY_Yacute: gint = 221

    public const val KEY_Ybelowdot: gint = 16785140

    public const val KEY_Ycircumflex: gint = 16777590

    public const val KEY_Ydiaeresis: gint = 5054

    public const val KEY_Yellow: gint = 269025189

    public const val KEY_Ygrave: gint = 16785138

    public const val KEY_Yhook: gint = 16785142

    public const val KEY_Ytilde: gint = 16785144

    public const val KEY_Z: gint = 90

    public const val KEY_Zabovedot: gint = 431

    public const val KEY_Zacute: gint = 428

    public const val KEY_Zcaron: gint = 430

    public const val KEY_Zen_Koho: gint = 65341

    public const val KEY_Zenkaku: gint = 65320

    public const val KEY_Zenkaku_Hankaku: gint = 65322

    public const val KEY_ZoomIn: gint = 269025163

    public const val KEY_ZoomOut: gint = 269025164

    public const val KEY_Zstroke: gint = 16777653

    public const val KEY_a: gint = 97

    public const val KEY_aacute: gint = 225

    public const val KEY_abelowdot: gint = 16785057

    public const val KEY_abovedot: gint = 511

    public const val KEY_abreve: gint = 483

    public const val KEY_abreveacute: gint = 16785071

    public const val KEY_abrevebelowdot: gint = 16785079

    public const val KEY_abrevegrave: gint = 16785073

    public const val KEY_abrevehook: gint = 16785075

    public const val KEY_abrevetilde: gint = 16785077

    public const val KEY_acircumflex: gint = 226

    public const val KEY_acircumflexacute: gint = 16785061

    public const val KEY_acircumflexbelowdot: gint = 16785069

    public const val KEY_acircumflexgrave: gint = 16785063

    public const val KEY_acircumflexhook: gint = 16785065

    public const val KEY_acircumflextilde: gint = 16785067

    public const val KEY_acute: gint = 180

    public const val KEY_adiaeresis: gint = 228

    public const val KEY_ae: gint = 230

    public const val KEY_agrave: gint = 224

    public const val KEY_ahook: gint = 16785059

    public const val KEY_amacron: gint = 992

    public const val KEY_ampersand: gint = 38

    public const val KEY_aogonek: gint = 433

    public const val KEY_apostrophe: gint = 39

    public const val KEY_approxeq: gint = 16785992

    public const val KEY_approximate: gint = 2248

    public const val KEY_aring: gint = 229

    public const val KEY_asciicircum: gint = 94

    public const val KEY_asciitilde: gint = 126

    public const val KEY_asterisk: gint = 42

    public const val KEY_at: gint = 64

    public const val KEY_atilde: gint = 227

    public const val KEY_b: gint = 98

    public const val KEY_babovedot: gint = 16784899

    public const val KEY_backslash: gint = 92

    public const val KEY_ballotcross: gint = 2804

    public const val KEY_bar: gint = 124

    public const val KEY_because: gint = 16785973

    public const val KEY_blank: gint = 2527

    public const val KEY_botintegral: gint = 2213

    public const val KEY_botleftparens: gint = 2220

    public const val KEY_botleftsqbracket: gint = 2216

    public const val KEY_botleftsummation: gint = 2226

    public const val KEY_botrightparens: gint = 2222

    public const val KEY_botrightsqbracket: gint = 2218

    public const val KEY_botrightsummation: gint = 2230

    public const val KEY_bott: gint = 2550

    public const val KEY_botvertsummationconnector: gint = 2228

    public const val KEY_braceleft: gint = 123

    public const val KEY_braceright: gint = 125

    public const val KEY_bracketleft: gint = 91

    public const val KEY_bracketright: gint = 93

    public const val KEY_braille_blank: gint = 16787456

    public const val KEY_braille_dot_1: gint = 65521

    public const val KEY_braille_dot_10: gint = 65530

    public const val KEY_braille_dot_2: gint = 65522

    public const val KEY_braille_dot_3: gint = 65523

    public const val KEY_braille_dot_4: gint = 65524

    public const val KEY_braille_dot_5: gint = 65525

    public const val KEY_braille_dot_6: gint = 65526

    public const val KEY_braille_dot_7: gint = 65527

    public const val KEY_braille_dot_8: gint = 65528

    public const val KEY_braille_dot_9: gint = 65529

    public const val KEY_braille_dots_1: gint = 16787457

    public const val KEY_braille_dots_12: gint = 16787459

    public const val KEY_braille_dots_123: gint = 16787463

    public const val KEY_braille_dots_1234: gint = 16787471

    public const val KEY_braille_dots_12345: gint = 16787487

    public const val KEY_braille_dots_123456: gint = 16787519

    public const val KEY_braille_dots_1234567: gint = 16787583

    public const val KEY_braille_dots_12345678: gint = 16787711

    public const val KEY_braille_dots_1234568: gint = 16787647

    public const val KEY_braille_dots_123457: gint = 16787551

    public const val KEY_braille_dots_1234578: gint = 16787679

    public const val KEY_braille_dots_123458: gint = 16787615

    public const val KEY_braille_dots_12346: gint = 16787503

    public const val KEY_braille_dots_123467: gint = 16787567

    public const val KEY_braille_dots_1234678: gint = 16787695

    public const val KEY_braille_dots_123468: gint = 16787631

    public const val KEY_braille_dots_12347: gint = 16787535

    public const val KEY_braille_dots_123478: gint = 16787663

    public const val KEY_braille_dots_12348: gint = 16787599

    public const val KEY_braille_dots_1235: gint = 16787479

    public const val KEY_braille_dots_12356: gint = 16787511

    public const val KEY_braille_dots_123567: gint = 16787575

    public const val KEY_braille_dots_1235678: gint = 16787703

    public const val KEY_braille_dots_123568: gint = 16787639

    public const val KEY_braille_dots_12357: gint = 16787543

    public const val KEY_braille_dots_123578: gint = 16787671

    public const val KEY_braille_dots_12358: gint = 16787607

    public const val KEY_braille_dots_1236: gint = 16787495

    public const val KEY_braille_dots_12367: gint = 16787559

    public const val KEY_braille_dots_123678: gint = 16787687

    public const val KEY_braille_dots_12368: gint = 16787623

    public const val KEY_braille_dots_1237: gint = 16787527

    public const val KEY_braille_dots_12378: gint = 16787655

    public const val KEY_braille_dots_1238: gint = 16787591

    public const val KEY_braille_dots_124: gint = 16787467

    public const val KEY_braille_dots_1245: gint = 16787483

    public const val KEY_braille_dots_12456: gint = 16787515

    public const val KEY_braille_dots_124567: gint = 16787579

    public const val KEY_braille_dots_1245678: gint = 16787707

    public const val KEY_braille_dots_124568: gint = 16787643

    public const val KEY_braille_dots_12457: gint = 16787547

    public const val KEY_braille_dots_124578: gint = 16787675

    public const val KEY_braille_dots_12458: gint = 16787611

    public const val KEY_braille_dots_1246: gint = 16787499

    public const val KEY_braille_dots_12467: gint = 16787563

    public const val KEY_braille_dots_124678: gint = 16787691

    public const val KEY_braille_dots_12468: gint = 16787627

    public const val KEY_braille_dots_1247: gint = 16787531

    public const val KEY_braille_dots_12478: gint = 16787659

    public const val KEY_braille_dots_1248: gint = 16787595

    public const val KEY_braille_dots_125: gint = 16787475

    public const val KEY_braille_dots_1256: gint = 16787507

    public const val KEY_braille_dots_12567: gint = 16787571

    public const val KEY_braille_dots_125678: gint = 16787699

    public const val KEY_braille_dots_12568: gint = 16787635

    public const val KEY_braille_dots_1257: gint = 16787539

    public const val KEY_braille_dots_12578: gint = 16787667

    public const val KEY_braille_dots_1258: gint = 16787603

    public const val KEY_braille_dots_126: gint = 16787491

    public const val KEY_braille_dots_1267: gint = 16787555

    public const val KEY_braille_dots_12678: gint = 16787683

    public const val KEY_braille_dots_1268: gint = 16787619

    public const val KEY_braille_dots_127: gint = 16787523

    public const val KEY_braille_dots_1278: gint = 16787651

    public const val KEY_braille_dots_128: gint = 16787587

    public const val KEY_braille_dots_13: gint = 16787461

    public const val KEY_braille_dots_134: gint = 16787469

    public const val KEY_braille_dots_1345: gint = 16787485

    public const val KEY_braille_dots_13456: gint = 16787517

    public const val KEY_braille_dots_134567: gint = 16787581

    public const val KEY_braille_dots_1345678: gint = 16787709

    public const val KEY_braille_dots_134568: gint = 16787645

    public const val KEY_braille_dots_13457: gint = 16787549

    public const val KEY_braille_dots_134578: gint = 16787677

    public const val KEY_braille_dots_13458: gint = 16787613

    public const val KEY_braille_dots_1346: gint = 16787501

    public const val KEY_braille_dots_13467: gint = 16787565

    public const val KEY_braille_dots_134678: gint = 16787693

    public const val KEY_braille_dots_13468: gint = 16787629

    public const val KEY_braille_dots_1347: gint = 16787533

    public const val KEY_braille_dots_13478: gint = 16787661

    public const val KEY_braille_dots_1348: gint = 16787597

    public const val KEY_braille_dots_135: gint = 16787477

    public const val KEY_braille_dots_1356: gint = 16787509

    public const val KEY_braille_dots_13567: gint = 16787573

    public const val KEY_braille_dots_135678: gint = 16787701

    public const val KEY_braille_dots_13568: gint = 16787637

    public const val KEY_braille_dots_1357: gint = 16787541

    public const val KEY_braille_dots_13578: gint = 16787669

    public const val KEY_braille_dots_1358: gint = 16787605

    public const val KEY_braille_dots_136: gint = 16787493

    public const val KEY_braille_dots_1367: gint = 16787557

    public const val KEY_braille_dots_13678: gint = 16787685

    public const val KEY_braille_dots_1368: gint = 16787621

    public const val KEY_braille_dots_137: gint = 16787525

    public const val KEY_braille_dots_1378: gint = 16787653

    public const val KEY_braille_dots_138: gint = 16787589

    public const val KEY_braille_dots_14: gint = 16787465

    public const val KEY_braille_dots_145: gint = 16787481

    public const val KEY_braille_dots_1456: gint = 16787513

    public const val KEY_braille_dots_14567: gint = 16787577

    public const val KEY_braille_dots_145678: gint = 16787705

    public const val KEY_braille_dots_14568: gint = 16787641

    public const val KEY_braille_dots_1457: gint = 16787545

    public const val KEY_braille_dots_14578: gint = 16787673

    public const val KEY_braille_dots_1458: gint = 16787609

    public const val KEY_braille_dots_146: gint = 16787497

    public const val KEY_braille_dots_1467: gint = 16787561

    public const val KEY_braille_dots_14678: gint = 16787689

    public const val KEY_braille_dots_1468: gint = 16787625

    public const val KEY_braille_dots_147: gint = 16787529

    public const val KEY_braille_dots_1478: gint = 16787657

    public const val KEY_braille_dots_148: gint = 16787593

    public const val KEY_braille_dots_15: gint = 16787473

    public const val KEY_braille_dots_156: gint = 16787505

    public const val KEY_braille_dots_1567: gint = 16787569

    public const val KEY_braille_dots_15678: gint = 16787697

    public const val KEY_braille_dots_1568: gint = 16787633

    public const val KEY_braille_dots_157: gint = 16787537

    public const val KEY_braille_dots_1578: gint = 16787665

    public const val KEY_braille_dots_158: gint = 16787601

    public const val KEY_braille_dots_16: gint = 16787489

    public const val KEY_braille_dots_167: gint = 16787553

    public const val KEY_braille_dots_1678: gint = 16787681

    public const val KEY_braille_dots_168: gint = 16787617

    public const val KEY_braille_dots_17: gint = 16787521

    public const val KEY_braille_dots_178: gint = 16787649

    public const val KEY_braille_dots_18: gint = 16787585

    public const val KEY_braille_dots_2: gint = 16787458

    public const val KEY_braille_dots_23: gint = 16787462

    public const val KEY_braille_dots_234: gint = 16787470

    public const val KEY_braille_dots_2345: gint = 16787486

    public const val KEY_braille_dots_23456: gint = 16787518

    public const val KEY_braille_dots_234567: gint = 16787582

    public const val KEY_braille_dots_2345678: gint = 16787710

    public const val KEY_braille_dots_234568: gint = 16787646

    public const val KEY_braille_dots_23457: gint = 16787550

    public const val KEY_braille_dots_234578: gint = 16787678

    public const val KEY_braille_dots_23458: gint = 16787614

    public const val KEY_braille_dots_2346: gint = 16787502

    public const val KEY_braille_dots_23467: gint = 16787566

    public const val KEY_braille_dots_234678: gint = 16787694

    public const val KEY_braille_dots_23468: gint = 16787630

    public const val KEY_braille_dots_2347: gint = 16787534

    public const val KEY_braille_dots_23478: gint = 16787662

    public const val KEY_braille_dots_2348: gint = 16787598

    public const val KEY_braille_dots_235: gint = 16787478

    public const val KEY_braille_dots_2356: gint = 16787510

    public const val KEY_braille_dots_23567: gint = 16787574

    public const val KEY_braille_dots_235678: gint = 16787702

    public const val KEY_braille_dots_23568: gint = 16787638

    public const val KEY_braille_dots_2357: gint = 16787542

    public const val KEY_braille_dots_23578: gint = 16787670

    public const val KEY_braille_dots_2358: gint = 16787606

    public const val KEY_braille_dots_236: gint = 16787494

    public const val KEY_braille_dots_2367: gint = 16787558

    public const val KEY_braille_dots_23678: gint = 16787686

    public const val KEY_braille_dots_2368: gint = 16787622

    public const val KEY_braille_dots_237: gint = 16787526

    public const val KEY_braille_dots_2378: gint = 16787654

    public const val KEY_braille_dots_238: gint = 16787590

    public const val KEY_braille_dots_24: gint = 16787466

    public const val KEY_braille_dots_245: gint = 16787482

    public const val KEY_braille_dots_2456: gint = 16787514

    public const val KEY_braille_dots_24567: gint = 16787578

    public const val KEY_braille_dots_245678: gint = 16787706

    public const val KEY_braille_dots_24568: gint = 16787642

    public const val KEY_braille_dots_2457: gint = 16787546

    public const val KEY_braille_dots_24578: gint = 16787674

    public const val KEY_braille_dots_2458: gint = 16787610

    public const val KEY_braille_dots_246: gint = 16787498

    public const val KEY_braille_dots_2467: gint = 16787562

    public const val KEY_braille_dots_24678: gint = 16787690

    public const val KEY_braille_dots_2468: gint = 16787626

    public const val KEY_braille_dots_247: gint = 16787530

    public const val KEY_braille_dots_2478: gint = 16787658

    public const val KEY_braille_dots_248: gint = 16787594

    public const val KEY_braille_dots_25: gint = 16787474

    public const val KEY_braille_dots_256: gint = 16787506

    public const val KEY_braille_dots_2567: gint = 16787570

    public const val KEY_braille_dots_25678: gint = 16787698

    public const val KEY_braille_dots_2568: gint = 16787634

    public const val KEY_braille_dots_257: gint = 16787538

    public const val KEY_braille_dots_2578: gint = 16787666

    public const val KEY_braille_dots_258: gint = 16787602

    public const val KEY_braille_dots_26: gint = 16787490

    public const val KEY_braille_dots_267: gint = 16787554

    public const val KEY_braille_dots_2678: gint = 16787682

    public const val KEY_braille_dots_268: gint = 16787618

    public const val KEY_braille_dots_27: gint = 16787522

    public const val KEY_braille_dots_278: gint = 16787650

    public const val KEY_braille_dots_28: gint = 16787586

    public const val KEY_braille_dots_3: gint = 16787460

    public const val KEY_braille_dots_34: gint = 16787468

    public const val KEY_braille_dots_345: gint = 16787484

    public const val KEY_braille_dots_3456: gint = 16787516

    public const val KEY_braille_dots_34567: gint = 16787580

    public const val KEY_braille_dots_345678: gint = 16787708

    public const val KEY_braille_dots_34568: gint = 16787644

    public const val KEY_braille_dots_3457: gint = 16787548

    public const val KEY_braille_dots_34578: gint = 16787676

    public const val KEY_braille_dots_3458: gint = 16787612

    public const val KEY_braille_dots_346: gint = 16787500

    public const val KEY_braille_dots_3467: gint = 16787564

    public const val KEY_braille_dots_34678: gint = 16787692

    public const val KEY_braille_dots_3468: gint = 16787628

    public const val KEY_braille_dots_347: gint = 16787532

    public const val KEY_braille_dots_3478: gint = 16787660

    public const val KEY_braille_dots_348: gint = 16787596

    public const val KEY_braille_dots_35: gint = 16787476

    public const val KEY_braille_dots_356: gint = 16787508

    public const val KEY_braille_dots_3567: gint = 16787572

    public const val KEY_braille_dots_35678: gint = 16787700

    public const val KEY_braille_dots_3568: gint = 16787636

    public const val KEY_braille_dots_357: gint = 16787540

    public const val KEY_braille_dots_3578: gint = 16787668

    public const val KEY_braille_dots_358: gint = 16787604

    public const val KEY_braille_dots_36: gint = 16787492

    public const val KEY_braille_dots_367: gint = 16787556

    public const val KEY_braille_dots_3678: gint = 16787684

    public const val KEY_braille_dots_368: gint = 16787620

    public const val KEY_braille_dots_37: gint = 16787524

    public const val KEY_braille_dots_378: gint = 16787652

    public const val KEY_braille_dots_38: gint = 16787588

    public const val KEY_braille_dots_4: gint = 16787464

    public const val KEY_braille_dots_45: gint = 16787480

    public const val KEY_braille_dots_456: gint = 16787512

    public const val KEY_braille_dots_4567: gint = 16787576

    public const val KEY_braille_dots_45678: gint = 16787704

    public const val KEY_braille_dots_4568: gint = 16787640

    public const val KEY_braille_dots_457: gint = 16787544

    public const val KEY_braille_dots_4578: gint = 16787672

    public const val KEY_braille_dots_458: gint = 16787608

    public const val KEY_braille_dots_46: gint = 16787496

    public const val KEY_braille_dots_467: gint = 16787560

    public const val KEY_braille_dots_4678: gint = 16787688

    public const val KEY_braille_dots_468: gint = 16787624

    public const val KEY_braille_dots_47: gint = 16787528

    public const val KEY_braille_dots_478: gint = 16787656

    public const val KEY_braille_dots_48: gint = 16787592

    public const val KEY_braille_dots_5: gint = 16787472

    public const val KEY_braille_dots_56: gint = 16787504

    public const val KEY_braille_dots_567: gint = 16787568

    public const val KEY_braille_dots_5678: gint = 16787696

    public const val KEY_braille_dots_568: gint = 16787632

    public const val KEY_braille_dots_57: gint = 16787536

    public const val KEY_braille_dots_578: gint = 16787664

    public const val KEY_braille_dots_58: gint = 16787600

    public const val KEY_braille_dots_6: gint = 16787488

    public const val KEY_braille_dots_67: gint = 16787552

    public const val KEY_braille_dots_678: gint = 16787680

    public const val KEY_braille_dots_68: gint = 16787616

    public const val KEY_braille_dots_7: gint = 16787520

    public const val KEY_braille_dots_78: gint = 16787648

    public const val KEY_braille_dots_8: gint = 16787584

    public const val KEY_breve: gint = 418

    public const val KEY_brokenbar: gint = 166

    public const val KEY_c: gint = 99

    public const val KEY_c_h: gint = 65187

    public const val KEY_cabovedot: gint = 741

    public const val KEY_cacute: gint = 486

    public const val KEY_careof: gint = 2744

    public const val KEY_caret: gint = 2812

    public const val KEY_caron: gint = 439

    public const val KEY_ccaron: gint = 488

    public const val KEY_ccedilla: gint = 231

    public const val KEY_ccircumflex: gint = 742

    public const val KEY_cedilla: gint = 184

    public const val KEY_cent: gint = 162

    public const val KEY_ch: gint = 65184

    public const val KEY_checkerboard: gint = 2529

    public const val KEY_checkmark: gint = 2803

    public const val KEY_circle: gint = 3023

    public const val KEY_club: gint = 2796

    public const val KEY_colon: gint = 58

    public const val KEY_comma: gint = 44

    public const val KEY_containsas: gint = 16785931

    public const val KEY_copyright: gint = 169

    public const val KEY_cr: gint = 2532

    public const val KEY_crossinglines: gint = 2542

    public const val KEY_cuberoot: gint = 16785947

    public const val KEY_currency: gint = 164

    public const val KEY_cursor: gint = 2815

    public const val KEY_d: gint = 100

    public const val KEY_dabovedot: gint = 16784907

    public const val KEY_dagger: gint = 2801

    public const val KEY_dcaron: gint = 495

    public const val KEY_dead_A: gint = 65153

    public const val KEY_dead_E: gint = 65155

    public const val KEY_dead_I: gint = 65157

    public const val KEY_dead_O: gint = 65159

    public const val KEY_dead_U: gint = 65161

    public const val KEY_dead_a: gint = 65152

    public const val KEY_dead_abovecomma: gint = 65124

    public const val KEY_dead_abovedot: gint = 65110

    public const val KEY_dead_abovereversedcomma: gint = 65125

    public const val KEY_dead_abovering: gint = 65112

    public const val KEY_dead_aboveverticalline: gint = 65169

    public const val KEY_dead_acute: gint = 65105

    public const val KEY_dead_belowbreve: gint = 65131

    public const val KEY_dead_belowcircumflex: gint = 65129

    public const val KEY_dead_belowcomma: gint = 65134

    public const val KEY_dead_belowdiaeresis: gint = 65132

    public const val KEY_dead_belowdot: gint = 65120

    public const val KEY_dead_belowmacron: gint = 65128

    public const val KEY_dead_belowring: gint = 65127

    public const val KEY_dead_belowtilde: gint = 65130

    public const val KEY_dead_belowverticalline: gint = 65170

    public const val KEY_dead_breve: gint = 65109

    public const val KEY_dead_capital_schwa: gint = 65163

    public const val KEY_dead_caron: gint = 65114

    public const val KEY_dead_cedilla: gint = 65115

    public const val KEY_dead_circumflex: gint = 65106

    public const val KEY_dead_currency: gint = 65135

    public const val KEY_dead_dasia: gint = 65125

    public const val KEY_dead_diaeresis: gint = 65111

    public const val KEY_dead_doubleacute: gint = 65113

    public const val KEY_dead_doublegrave: gint = 65126

    public const val KEY_dead_e: gint = 65154

    public const val KEY_dead_grave: gint = 65104

    public const val KEY_dead_greek: gint = 65164

    public const val KEY_dead_hook: gint = 65121

    public const val KEY_dead_horn: gint = 65122

    public const val KEY_dead_i: gint = 65156

    public const val KEY_dead_invertedbreve: gint = 65133

    public const val KEY_dead_iota: gint = 65117

    public const val KEY_dead_longsolidusoverlay: gint = 65171

    public const val KEY_dead_lowline: gint = 65168

    public const val KEY_dead_macron: gint = 65108

    public const val KEY_dead_o: gint = 65158

    public const val KEY_dead_ogonek: gint = 65116

    public const val KEY_dead_perispomeni: gint = 65107

    public const val KEY_dead_psili: gint = 65124

    public const val KEY_dead_semivoiced_sound: gint = 65119

    public const val KEY_dead_small_schwa: gint = 65162

    public const val KEY_dead_stroke: gint = 65123

    public const val KEY_dead_tilde: gint = 65107

    public const val KEY_dead_u: gint = 65160

    public const val KEY_dead_voiced_sound: gint = 65118

    public const val KEY_decimalpoint: gint = 2749

    public const val KEY_degree: gint = 176

    public const val KEY_diaeresis: gint = 168

    public const val KEY_diamond: gint = 2797

    public const val KEY_digitspace: gint = 2725

    public const val KEY_dintegral: gint = 16785964

    public const val KEY_division: gint = 247

    public const val KEY_dollar: gint = 36

    public const val KEY_doubbaselinedot: gint = 2735

    public const val KEY_doubleacute: gint = 445

    public const val KEY_doubledagger: gint = 2802

    public const val KEY_doublelowquotemark: gint = 2814

    public const val KEY_downarrow: gint = 2302

    public const val KEY_downcaret: gint = 2984

    public const val KEY_downshoe: gint = 3030

    public const val KEY_downstile: gint = 3012

    public const val KEY_downtack: gint = 3010

    public const val KEY_dstroke: gint = 496

    public const val KEY_e: gint = 101

    public const val KEY_eabovedot: gint = 1004

    public const val KEY_eacute: gint = 233

    public const val KEY_ebelowdot: gint = 16785081

    public const val KEY_ecaron: gint = 492

    public const val KEY_ecircumflex: gint = 234

    public const val KEY_ecircumflexacute: gint = 16785087

    public const val KEY_ecircumflexbelowdot: gint = 16785095

    public const val KEY_ecircumflexgrave: gint = 16785089

    public const val KEY_ecircumflexhook: gint = 16785091

    public const val KEY_ecircumflextilde: gint = 16785093

    public const val KEY_ediaeresis: gint = 235

    public const val KEY_egrave: gint = 232

    public const val KEY_ehook: gint = 16785083

    public const val KEY_eightsubscript: gint = 16785544

    public const val KEY_eightsuperior: gint = 16785528

    public const val KEY_elementof: gint = 16785928

    public const val KEY_ellipsis: gint = 2734

    public const val KEY_em3space: gint = 2723

    public const val KEY_em4space: gint = 2724

    public const val KEY_emacron: gint = 954

    public const val KEY_emdash: gint = 2729

    public const val KEY_emfilledcircle: gint = 2782

    public const val KEY_emfilledrect: gint = 2783

    public const val KEY_emopencircle: gint = 2766

    public const val KEY_emopenrectangle: gint = 2767

    public const val KEY_emptyset: gint = 16785925

    public const val KEY_emspace: gint = 2721

    public const val KEY_endash: gint = 2730

    public const val KEY_enfilledcircbullet: gint = 2790

    public const val KEY_enfilledsqbullet: gint = 2791

    public const val KEY_eng: gint = 959

    public const val KEY_enopencircbullet: gint = 2784

    public const val KEY_enopensquarebullet: gint = 2785

    public const val KEY_enspace: gint = 2722

    public const val KEY_eogonek: gint = 490

    public const val KEY_equal: gint = 61

    public const val KEY_eth: gint = 240

    public const val KEY_etilde: gint = 16785085

    public const val KEY_exclam: gint = 33

    public const val KEY_exclamdown: gint = 161

    public const val KEY_ezh: gint = 16777874

    public const val KEY_f: gint = 102

    public const val KEY_fabovedot: gint = 16784927

    public const val KEY_femalesymbol: gint = 2808

    public const val KEY_ff: gint = 2531

    public const val KEY_figdash: gint = 2747

    public const val KEY_filledlefttribullet: gint = 2780

    public const val KEY_filledrectbullet: gint = 2779

    public const val KEY_filledrighttribullet: gint = 2781

    public const val KEY_filledtribulletdown: gint = 2793

    public const val KEY_filledtribulletup: gint = 2792

    public const val KEY_fiveeighths: gint = 2757

    public const val KEY_fivesixths: gint = 2743

    public const val KEY_fivesubscript: gint = 16785541

    public const val KEY_fivesuperior: gint = 16785525

    public const val KEY_fourfifths: gint = 2741

    public const val KEY_foursubscript: gint = 16785540

    public const val KEY_foursuperior: gint = 16785524

    public const val KEY_fourthroot: gint = 16785948

    public const val KEY_function: gint = 2294

    public const val KEY_g: gint = 103

    public const val KEY_gabovedot: gint = 757

    public const val KEY_gbreve: gint = 699

    public const val KEY_gcaron: gint = 16777703

    public const val KEY_gcedilla: gint = 955

    public const val KEY_gcircumflex: gint = 760

    public const val KEY_grave: gint = 96

    public const val KEY_greater: gint = 62

    public const val KEY_greaterthanequal: gint = 2238

    public const val KEY_guillemotleft: gint = 171

    public const val KEY_guillemotright: gint = 187

    public const val KEY_h: gint = 104

    public const val KEY_hairspace: gint = 2728

    public const val KEY_hcircumflex: gint = 694

    public const val KEY_heart: gint = 2798

    public const val KEY_hebrew_aleph: gint = 3296

    public const val KEY_hebrew_ayin: gint = 3314

    public const val KEY_hebrew_bet: gint = 3297

    public const val KEY_hebrew_beth: gint = 3297

    public const val KEY_hebrew_chet: gint = 3303

    public const val KEY_hebrew_dalet: gint = 3299

    public const val KEY_hebrew_daleth: gint = 3299

    public const val KEY_hebrew_doublelowline: gint = 3295

    public const val KEY_hebrew_finalkaph: gint = 3306

    public const val KEY_hebrew_finalmem: gint = 3309

    public const val KEY_hebrew_finalnun: gint = 3311

    public const val KEY_hebrew_finalpe: gint = 3315

    public const val KEY_hebrew_finalzade: gint = 3317

    public const val KEY_hebrew_finalzadi: gint = 3317

    public const val KEY_hebrew_gimel: gint = 3298

    public const val KEY_hebrew_gimmel: gint = 3298

    public const val KEY_hebrew_he: gint = 3300

    public const val KEY_hebrew_het: gint = 3303

    public const val KEY_hebrew_kaph: gint = 3307

    public const val KEY_hebrew_kuf: gint = 3319

    public const val KEY_hebrew_lamed: gint = 3308

    public const val KEY_hebrew_mem: gint = 3310

    public const val KEY_hebrew_nun: gint = 3312

    public const val KEY_hebrew_pe: gint = 3316

    public const val KEY_hebrew_qoph: gint = 3319

    public const val KEY_hebrew_resh: gint = 3320

    public const val KEY_hebrew_samech: gint = 3313

    public const val KEY_hebrew_samekh: gint = 3313

    public const val KEY_hebrew_shin: gint = 3321

    public const val KEY_hebrew_taf: gint = 3322

    public const val KEY_hebrew_taw: gint = 3322

    public const val KEY_hebrew_tet: gint = 3304

    public const val KEY_hebrew_teth: gint = 3304

    public const val KEY_hebrew_waw: gint = 3301

    public const val KEY_hebrew_yod: gint = 3305

    public const val KEY_hebrew_zade: gint = 3318

    public const val KEY_hebrew_zadi: gint = 3318

    public const val KEY_hebrew_zain: gint = 3302

    public const val KEY_hebrew_zayin: gint = 3302

    public const val KEY_hexagram: gint = 2778

    public const val KEY_horizconnector: gint = 2211

    public const val KEY_horizlinescan1: gint = 2543

    public const val KEY_horizlinescan3: gint = 2544

    public const val KEY_horizlinescan5: gint = 2545

    public const val KEY_horizlinescan7: gint = 2546

    public const val KEY_horizlinescan9: gint = 2547

    public const val KEY_hstroke: gint = 689

    public const val KEY_ht: gint = 2530

    public const val KEY_hyphen: gint = 173

    public const val KEY_i: gint = 105

    public const val KEY_iTouch: gint = 269025120

    public const val KEY_iacute: gint = 237

    public const val KEY_ibelowdot: gint = 16785099

    public const val KEY_ibreve: gint = 16777517

    public const val KEY_icircumflex: gint = 238

    public const val KEY_identical: gint = 2255

    public const val KEY_idiaeresis: gint = 239

    public const val KEY_idotless: gint = 697

    public const val KEY_ifonlyif: gint = 2253

    public const val KEY_igrave: gint = 236

    public const val KEY_ihook: gint = 16785097

    public const val KEY_imacron: gint = 1007

    public const val KEY_implies: gint = 2254

    public const val KEY_includedin: gint = 2266

    public const val KEY_includes: gint = 2267

    public const val KEY_infinity: gint = 2242

    public const val KEY_integral: gint = 2239

    public const val KEY_intersection: gint = 2268

    public const val KEY_iogonek: gint = 999

    public const val KEY_itilde: gint = 949

    public const val KEY_j: gint = 106

    public const val KEY_jcircumflex: gint = 700

    public const val KEY_jot: gint = 3018

    public const val KEY_k: gint = 107

    public const val KEY_kana_A: gint = 1201

    public const val KEY_kana_CHI: gint = 1217

    public const val KEY_kana_E: gint = 1204

    public const val KEY_kana_FU: gint = 1228

    public const val KEY_kana_HA: gint = 1226

    public const val KEY_kana_HE: gint = 1229

    public const val KEY_kana_HI: gint = 1227

    public const val KEY_kana_HO: gint = 1230

    public const val KEY_kana_HU: gint = 1228

    public const val KEY_kana_I: gint = 1202

    public const val KEY_kana_KA: gint = 1206

    public const val KEY_kana_KE: gint = 1209

    public const val KEY_kana_KI: gint = 1207

    public const val KEY_kana_KO: gint = 1210

    public const val KEY_kana_KU: gint = 1208

    public const val KEY_kana_MA: gint = 1231

    public const val KEY_kana_ME: gint = 1234

    public const val KEY_kana_MI: gint = 1232

    public const val KEY_kana_MO: gint = 1235

    public const val KEY_kana_MU: gint = 1233

    public const val KEY_kana_N: gint = 1245

    public const val KEY_kana_NA: gint = 1221

    public const val KEY_kana_NE: gint = 1224

    public const val KEY_kana_NI: gint = 1222

    public const val KEY_kana_NO: gint = 1225

    public const val KEY_kana_NU: gint = 1223

    public const val KEY_kana_O: gint = 1205

    public const val KEY_kana_RA: gint = 1239

    public const val KEY_kana_RE: gint = 1242

    public const val KEY_kana_RI: gint = 1240

    public const val KEY_kana_RO: gint = 1243

    public const val KEY_kana_RU: gint = 1241

    public const val KEY_kana_SA: gint = 1211

    public const val KEY_kana_SE: gint = 1214

    public const val KEY_kana_SHI: gint = 1212

    public const val KEY_kana_SO: gint = 1215

    public const val KEY_kana_SU: gint = 1213

    public const val KEY_kana_TA: gint = 1216

    public const val KEY_kana_TE: gint = 1219

    public const val KEY_kana_TI: gint = 1217

    public const val KEY_kana_TO: gint = 1220

    public const val KEY_kana_TSU: gint = 1218

    public const val KEY_kana_TU: gint = 1218

    public const val KEY_kana_U: gint = 1203

    public const val KEY_kana_WA: gint = 1244

    public const val KEY_kana_WO: gint = 1190

    public const val KEY_kana_YA: gint = 1236

    public const val KEY_kana_YO: gint = 1238

    public const val KEY_kana_YU: gint = 1237

    public const val KEY_kana_a: gint = 1191

    public const val KEY_kana_closingbracket: gint = 1187

    public const val KEY_kana_comma: gint = 1188

    public const val KEY_kana_conjunctive: gint = 1189

    public const val KEY_kana_e: gint = 1194

    public const val KEY_kana_fullstop: gint = 1185

    public const val KEY_kana_i: gint = 1192

    public const val KEY_kana_middledot: gint = 1189

    public const val KEY_kana_o: gint = 1195

    public const val KEY_kana_openingbracket: gint = 1186

    public const val KEY_kana_switch: gint = 65406

    public const val KEY_kana_tsu: gint = 1199

    public const val KEY_kana_tu: gint = 1199

    public const val KEY_kana_u: gint = 1193

    public const val KEY_kana_ya: gint = 1196

    public const val KEY_kana_yo: gint = 1198

    public const val KEY_kana_yu: gint = 1197

    public const val KEY_kappa: gint = 930

    public const val KEY_kcedilla: gint = 1011

    public const val KEY_kra: gint = 930

    public const val KEY_l: gint = 108

    public const val KEY_lacute: gint = 485

    public const val KEY_latincross: gint = 2777

    public const val KEY_lbelowdot: gint = 16784951

    public const val KEY_lcaron: gint = 437

    public const val KEY_lcedilla: gint = 950

    public const val KEY_leftanglebracket: gint = 2748

    public const val KEY_leftarrow: gint = 2299

    public const val KEY_leftcaret: gint = 2979

    public const val KEY_leftdoublequotemark: gint = 2770

    public const val KEY_leftmiddlecurlybrace: gint = 2223

    public const val KEY_leftopentriangle: gint = 2764

    public const val KEY_leftpointer: gint = 2794

    public const val KEY_leftradical: gint = 2209

    public const val KEY_leftshoe: gint = 3034

    public const val KEY_leftsinglequotemark: gint = 2768

    public const val KEY_leftt: gint = 2548

    public const val KEY_lefttack: gint = 3036

    public const val KEY_less: gint = 60

    public const val KEY_lessthanequal: gint = 2236

    public const val KEY_lf: gint = 2533

    public const val KEY_logicaland: gint = 2270

    public const val KEY_logicalor: gint = 2271

    public const val KEY_lowleftcorner: gint = 2541

    public const val KEY_lowrightcorner: gint = 2538

    public const val KEY_lstroke: gint = 435

    public const val KEY_m: gint = 109

    public const val KEY_mabovedot: gint = 16784961

    public const val KEY_macron: gint = 175

    public const val KEY_malesymbol: gint = 2807

    public const val KEY_maltesecross: gint = 2800

    public const val KEY_marker: gint = 2751

    public const val KEY_masculine: gint = 186

    public const val KEY_minus: gint = 45

    public const val KEY_minutes: gint = 2774

    public const val KEY_mu: gint = 181

    public const val KEY_multiply: gint = 215

    public const val KEY_musicalflat: gint = 2806

    public const val KEY_musicalsharp: gint = 2805

    public const val KEY_n: gint = 110

    public const val KEY_nabla: gint = 2245

    public const val KEY_nacute: gint = 497

    public const val KEY_ncaron: gint = 498

    public const val KEY_ncedilla: gint = 1009

    public const val KEY_ninesubscript: gint = 16785545

    public const val KEY_ninesuperior: gint = 16785529

    public const val KEY_nl: gint = 2536

    public const val KEY_nobreakspace: gint = 160

    public const val KEY_notapproxeq: gint = 16785991

    public const val KEY_notelementof: gint = 16785929

    public const val KEY_notequal: gint = 2237

    public const val KEY_notidentical: gint = 16786018

    public const val KEY_notsign: gint = 172

    public const val KEY_ntilde: gint = 241

    public const val KEY_numbersign: gint = 35

    public const val KEY_numerosign: gint = 1712

    public const val KEY_o: gint = 111

    public const val KEY_oacute: gint = 243

    public const val KEY_obarred: gint = 16777845

    public const val KEY_obelowdot: gint = 16785101

    public const val KEY_ocaron: gint = 16777682

    public const val KEY_ocircumflex: gint = 244

    public const val KEY_ocircumflexacute: gint = 16785105

    public const val KEY_ocircumflexbelowdot: gint = 16785113

    public const val KEY_ocircumflexgrave: gint = 16785107

    public const val KEY_ocircumflexhook: gint = 16785109

    public const val KEY_ocircumflextilde: gint = 16785111

    public const val KEY_odiaeresis: gint = 246

    public const val KEY_odoubleacute: gint = 501

    public const val KEY_oe: gint = 5053

    public const val KEY_ogonek: gint = 434

    public const val KEY_ograve: gint = 242

    public const val KEY_ohook: gint = 16785103

    public const val KEY_ohorn: gint = 16777633

    public const val KEY_ohornacute: gint = 16785115

    public const val KEY_ohornbelowdot: gint = 16785123

    public const val KEY_ohorngrave: gint = 16785117

    public const val KEY_ohornhook: gint = 16785119

    public const val KEY_ohorntilde: gint = 16785121

    public const val KEY_omacron: gint = 1010

    public const val KEY_oneeighth: gint = 2755

    public const val KEY_onefifth: gint = 2738

    public const val KEY_onehalf: gint = 189

    public const val KEY_onequarter: gint = 188

    public const val KEY_onesixth: gint = 2742

    public const val KEY_onesubscript: gint = 16785537

    public const val KEY_onesuperior: gint = 185

    public const val KEY_onethird: gint = 2736

    public const val KEY_ooblique: gint = 248

    public const val KEY_openrectbullet: gint = 2786

    public const val KEY_openstar: gint = 2789

    public const val KEY_opentribulletdown: gint = 2788

    public const val KEY_opentribulletup: gint = 2787

    public const val KEY_ordfeminine: gint = 170

    public const val KEY_oslash: gint = 248

    public const val KEY_otilde: gint = 245

    public const val KEY_overbar: gint = 3008

    public const val KEY_overline: gint = 1150

    public const val KEY_p: gint = 112

    public const val KEY_pabovedot: gint = 16784983

    public const val KEY_paragraph: gint = 182

    public const val KEY_parenleft: gint = 40

    public const val KEY_parenright: gint = 41

    public const val KEY_partdifferential: gint = 16785922

    public const val KEY_partialderivative: gint = 2287

    public const val KEY_percent: gint = 37

    public const val KEY_period: gint = 46

    public const val KEY_periodcentered: gint = 183

    public const val KEY_permille: gint = 2773

    public const val KEY_phonographcopyright: gint = 2811

    public const val KEY_plus: gint = 43

    public const val KEY_plusminus: gint = 177

    public const val KEY_prescription: gint = 2772

    public const val KEY_prolongedsound: gint = 1200

    public const val KEY_punctspace: gint = 2726

    public const val KEY_q: gint = 113

    public const val KEY_quad: gint = 3020

    public const val KEY_question: gint = 63

    public const val KEY_questiondown: gint = 191

    public const val KEY_quotedbl: gint = 34

    public const val KEY_quoteleft: gint = 96

    public const val KEY_quoteright: gint = 39

    public const val KEY_r: gint = 114

    public const val KEY_racute: gint = 480

    public const val KEY_radical: gint = 2262

    public const val KEY_rcaron: gint = 504

    public const val KEY_rcedilla: gint = 947

    public const val KEY_registered: gint = 174

    public const val KEY_rightanglebracket: gint = 2750

    public const val KEY_rightarrow: gint = 2301

    public const val KEY_rightcaret: gint = 2982

    public const val KEY_rightdoublequotemark: gint = 2771

    public const val KEY_rightmiddlecurlybrace: gint = 2224

    public const val KEY_rightmiddlesummation: gint = 2231

    public const val KEY_rightopentriangle: gint = 2765

    public const val KEY_rightpointer: gint = 2795

    public const val KEY_rightshoe: gint = 3032

    public const val KEY_rightsinglequotemark: gint = 2769

    public const val KEY_rightt: gint = 2549

    public const val KEY_righttack: gint = 3068

    public const val KEY_s: gint = 115

    public const val KEY_sabovedot: gint = 16784993

    public const val KEY_sacute: gint = 438

    public const val KEY_scaron: gint = 441

    public const val KEY_scedilla: gint = 442

    public const val KEY_schwa: gint = 16777817

    public const val KEY_scircumflex: gint = 766

    public const val KEY_script_switch: gint = 65406

    public const val KEY_seconds: gint = 2775

    public const val KEY_section: gint = 167

    public const val KEY_semicolon: gint = 59

    public const val KEY_semivoicedsound: gint = 1247

    public const val KEY_seveneighths: gint = 2758

    public const val KEY_sevensubscript: gint = 16785543

    public const val KEY_sevensuperior: gint = 16785527

    public const val KEY_signaturemark: gint = 2762

    public const val KEY_signifblank: gint = 2732

    public const val KEY_similarequal: gint = 2249

    public const val KEY_singlelowquotemark: gint = 2813

    public const val KEY_sixsubscript: gint = 16785542

    public const val KEY_sixsuperior: gint = 16785526

    public const val KEY_slash: gint = 47

    public const val KEY_soliddiamond: gint = 2528

    public const val KEY_space: gint = 32

    public const val KEY_squareroot: gint = 16785946

    public const val KEY_ssharp: gint = 223

    public const val KEY_sterling: gint = 163

    public const val KEY_stricteq: gint = 16786019

    public const val KEY_t: gint = 116

    public const val KEY_tabovedot: gint = 16785003

    public const val KEY_tcaron: gint = 443

    public const val KEY_tcedilla: gint = 510

    public const val KEY_telephone: gint = 2809

    public const val KEY_telephonerecorder: gint = 2810

    public const val KEY_therefore: gint = 2240

    public const val KEY_thinspace: gint = 2727

    public const val KEY_thorn: gint = 254

    public const val KEY_threeeighths: gint = 2756

    public const val KEY_threefifths: gint = 2740

    public const val KEY_threequarters: gint = 190

    public const val KEY_threesubscript: gint = 16785539

    public const val KEY_threesuperior: gint = 179

    public const val KEY_tintegral: gint = 16785965

    public const val KEY_topintegral: gint = 2212

    public const val KEY_topleftparens: gint = 2219

    public const val KEY_topleftradical: gint = 2210

    public const val KEY_topleftsqbracket: gint = 2215

    public const val KEY_topleftsummation: gint = 2225

    public const val KEY_toprightparens: gint = 2221

    public const val KEY_toprightsqbracket: gint = 2217

    public const val KEY_toprightsummation: gint = 2229

    public const val KEY_topt: gint = 2551

    public const val KEY_topvertsummationconnector: gint = 2227

    public const val KEY_trademark: gint = 2761

    public const val KEY_trademarkincircle: gint = 2763

    public const val KEY_tslash: gint = 956

    public const val KEY_twofifths: gint = 2739

    public const val KEY_twosubscript: gint = 16785538

    public const val KEY_twosuperior: gint = 178

    public const val KEY_twothirds: gint = 2737

    public const val KEY_u: gint = 117

    public const val KEY_uacute: gint = 250

    public const val KEY_ubelowdot: gint = 16785125

    public const val KEY_ubreve: gint = 765

    public const val KEY_ucircumflex: gint = 251

    public const val KEY_udiaeresis: gint = 252

    public const val KEY_udoubleacute: gint = 507

    public const val KEY_ugrave: gint = 249

    public const val KEY_uhook: gint = 16785127

    public const val KEY_uhorn: gint = 16777648

    public const val KEY_uhornacute: gint = 16785129

    public const val KEY_uhornbelowdot: gint = 16785137

    public const val KEY_uhorngrave: gint = 16785131

    public const val KEY_uhornhook: gint = 16785133

    public const val KEY_uhorntilde: gint = 16785135

    public const val KEY_umacron: gint = 1022

    public const val KEY_underbar: gint = 3014

    public const val KEY_underscore: gint = 95

    public const val KEY_union: gint = 2269

    public const val KEY_uogonek: gint = 1017

    public const val KEY_uparrow: gint = 2300

    public const val KEY_upcaret: gint = 2985

    public const val KEY_upleftcorner: gint = 2540

    public const val KEY_uprightcorner: gint = 2539

    public const val KEY_upshoe: gint = 3011

    public const val KEY_upstile: gint = 3027

    public const val KEY_uptack: gint = 3022

    public const val KEY_uring: gint = 505

    public const val KEY_utilde: gint = 1021

    public const val KEY_v: gint = 118

    public const val KEY_variation: gint = 2241

    public const val KEY_vertbar: gint = 2552

    public const val KEY_vertconnector: gint = 2214

    public const val KEY_voicedsound: gint = 1246

    public const val KEY_vt: gint = 2537

    public const val KEY_w: gint = 119

    public const val KEY_wacute: gint = 16785027

    public const val KEY_wcircumflex: gint = 16777589

    public const val KEY_wdiaeresis: gint = 16785029

    public const val KEY_wgrave: gint = 16785025

    public const val KEY_x: gint = 120

    public const val KEY_xabovedot: gint = 16785035

    public const val KEY_y: gint = 121

    public const val KEY_yacute: gint = 253

    public const val KEY_ybelowdot: gint = 16785141

    public const val KEY_ycircumflex: gint = 16777591

    public const val KEY_ydiaeresis: guint8 = UByte.MAX_VALUE

    public const val KEY_yen: gint = 165

    public const val KEY_ygrave: gint = 16785139

    public const val KEY_yhook: gint = 16785143

    public const val KEY_ytilde: gint = 16785145

    public const val KEY_z: gint = 122

    public const val KEY_zabovedot: gint = 447

    public const val KEY_zacute: gint = 444

    public const val KEY_zcaron: gint = 446

    public const val KEY_zerosubscript: gint = 16785536

    public const val KEY_zerosuperior: gint = 16785520

    public const val KEY_zstroke: gint = 16777654

    /**
     * A mask covering all entries in `GdkModifierType`.
     */
    public const val MODIFIER_MASK: gint = 469769999

    /**
     * This is the priority that the idle handler processing surface updates
     * is given in the main loop.
     */
    public const val PRIORITY_REDRAW: gint = 120

    /**
     * The main way to not draw GL content in GTK.
     *
     * It takes a render buffer ID (@source_type == GL_RENDERBUFFER) or a texture
     * id (@source_type == GL_TEXTURE) and draws it onto @cr with an OVER operation,
     * respecting the current clip. The top left corner of the rectangle specified
     * by @x, @y, @width and @height will be drawn at the current (0,0) position of
     * the `cairo_t`.
     *
     * This will work for *all* `cairo_t`, as long as @surface is realized, but the
     * fallback implementation that reads back the pixels from the buffer may be
     * used in the general case. In the case of direct drawing to a surface with
     * no special effects applied to @cr it will however use a more efficient
     * approach.
     *
     * For GL_RENDERBUFFER the code will always fall back to software for buffers
     * with alpha components, so make sure you use GL_TEXTURE if using alpha.
     *
     * Calling this may change the current GL context.
     *
     * @param cr a cairo context
     * @param surface The surface we're rendering for (not necessarily into)
     * @param source The GL ID of the source buffer
     * @param sourceType The type of the @source
     * @param bufferScale The scale-factor that the @source buffer is allocated for
     * @param x The source x position in @source to start copying from in GL coordinates
     * @param y The source y position in @source to start copying from in GL coordinates
     * @param width The width of the region to draw
     * @param height The height of the region to draw
     */
    public fun cairoDrawFromGl(
        cr: Context,
        surface: Surface,
        source: gint,
        sourceType: gint,
        bufferScale: gint,
        x: gint,
        y: gint,
        width: gint,
        height: gint,
    ): Unit =
        gdk_cairo_draw_from_gl(cr.gPointer.reinterpret(), surface.gdkSurfacePointer.reinterpret(), source, sourceType, bufferScale, x, y, width, height)

    /**
     * Adds the given rectangle to the current path of @cr.
     *
     * @param cr a cairo context
     * @param rectangle a `GdkRectangle`
     */
    public fun cairoRectangle(cr: Context, rectangle: Rectangle): Unit =
        gdk_cairo_rectangle(cr.gPointer.reinterpret(), rectangle.gPointer.reinterpret())

    /**
     * Adds the given region to the current path of @cr.
     *
     * @param cr a cairo context
     * @param region a `cairo_region_t`
     */
    public fun cairoRegion(cr: Context, region: Region): Unit =
        gdk_cairo_region(cr.gPointer.reinterpret(), region.gPointer.reinterpret())

    /**
     * Creates region that covers the area where the given
     * @surface is more than 50% opaque.
     *
     * This function takes into account device offsets that might be
     * set with cairo_surface_set_device_offset().
     *
     * @param surface a cairo surface
     * @return A `cairo_region_t`
     */
    public fun cairoRegionCreateFromSurface(surface: org.gtkkn.bindings.cairo.Surface): Region =
        gdk_cairo_region_create_from_surface(surface.gPointer.reinterpret())!!.run {
            Region(reinterpret())
        }

    /**
     * Sets the given pixbuf as the source pattern for @cr.
     *
     * The pattern has an extend mode of %CAIRO_EXTEND_NONE and is aligned
     * so that the origin of @pixbuf is @pixbuf_x, @pixbuf_y.
     *
     * @param cr a cairo context
     * @param pixbuf a `GdkPixbuf`
     * @param pixbufX X coordinate of location to place upper left corner of @pixbuf
     * @param pixbufY Y coordinate of location to place upper left corner of @pixbuf
     */
    public fun cairoSetSourcePixbuf(cr: Context, pixbuf: Pixbuf, pixbufX: gdouble, pixbufY: gdouble): Unit =
        gdk_cairo_set_source_pixbuf(cr.gPointer.reinterpret(), pixbuf.gdkPixbufPointer.reinterpret(), pixbufX, pixbufY)

    /**
     * Sets the specified `GdkRGBA` as the source color of @cr.
     *
     * @param cr a cairo context
     * @param rgba a `GdkRGBA`
     */
    public fun cairoSetSourceRgba(cr: Context, rgba: Rgba): Unit =
        gdk_cairo_set_source_rgba(cr.gPointer.reinterpret(), rgba.gPointer.reinterpret())

    /**
     * Read content from the given input stream and deserialize it, asynchronously.
     *
     * The default I/O priority is %G_PRIORITY_DEFAULT (i.e. 0), and lower numbers
     * indicate a higher priority.
     *
     * When the operation is finished, @callback will be called. You must then
     * call [func@Gdk.content_deserialize_finish] to get the result of the operation.
     *
     * @param stream a `GInputStream` to read the serialized content from
     * @param mimeType the mime type to deserialize from
     * @param type the GType to deserialize from
     * @param ioPriority the I/O priority of the operation
     * @param cancellable optional `GCancellable` object
     * @param callback callback to call when the operation is done
     */
    public fun contentDeserializeAsync(
        stream: InputStream,
        mimeType: String,
        type: GType,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gdk_content_deserialize_async(
        stream.gioInputStreamPointer.reinterpret(),
        mimeType,
        type,
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes a content deserialization operation.
     *
     * @param result the `GAsyncResult`
     * @param value return location for the result of the operation
     * @return true if the operation was successful. In this case,
     *   @value is set. false if an error occurred. In this case,
     *   @error is set
     */
    public fun contentDeserializeFinish(result: AsyncResult, `value`: Value): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_content_deserialize_finish(
            result.gioAsyncResultPointer,
            `value`.gPointer.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.gdk.Gdk.resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Registers a function to deserialize object of a given type.
     *
     * @param mimeType the mime type which the function can deserialize from
     * @param type the type of objects that the function creates
     * @param deserialize the callback
     */
    public fun contentRegisterDeserializer(mimeType: String, type: GType, deserialize: ContentDeserializeFunc): Unit =
        gdk_content_register_deserializer(
            mimeType,
            type,
            ContentDeserializeFuncFunc.reinterpret(),
            StableRef.create(deserialize).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Registers a function to serialize objects of a given type.
     *
     * @param type the type of objects that the function can serialize
     * @param mimeType the mime type to serialize to
     * @param serialize the callback
     */
    public fun contentRegisterSerializer(type: GType, mimeType: String, serialize: ContentSerializeFunc): Unit =
        gdk_content_register_serializer(
            type,
            mimeType,
            ContentSerializeFuncFunc.reinterpret(),
            StableRef.create(serialize).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Serialize content and write it to the given output stream, asynchronously.
     *
     * The default I/O priority is %G_PRIORITY_DEFAULT (i.e. 0), and lower numbers
     * indicate a higher priority.
     *
     * When the operation is finished, @callback will be called. You must then
     * call [func@Gdk.content_serialize_finish] to get the result of the operation.
     *
     * @param stream a `GOutputStream` to write the serialized content to
     * @param mimeType the mime type to serialize to
     * @param value the content to serialize
     * @param ioPriority the I/O priority of the operation
     * @param cancellable optional `GCancellable` object
     * @param callback callback to call when the operation is done
     */
    public fun contentSerializeAsync(
        stream: OutputStream,
        mimeType: String,
        `value`: Value,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gdk_content_serialize_async(
        stream.gioOutputStreamPointer.reinterpret(),
        mimeType,
        `value`.gPointer.reinterpret(),
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes a content serialization operation.
     *
     * @param result the `GAsyncResult`
     * @return true if the operation was successful, false if an
     *   error occurred. In this case, @error is set
     */
    public fun contentSerializeFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_content_serialize_finish(result.gioAsyncResultPointer, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.gdk.Gdk.resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    public fun dragSurfaceSizeGetType(): GType = gdk_drag_surface_size_get_type()

    /**
     * Canonicalizes the given mime type and interns the result.
     *
     * If @string is not a valid mime type, null is returned instead.
     * See RFC 2048 for the syntax if mime types.
     *
     * @param string string of a potential mime type
     * @return An interned string for the canonicalized
     *   mime type or null if the string wasn't a valid mime type
     */
    public fun internMimeType(string: String): String? = gdk_intern_mime_type(string)?.toKString()

    /**
     * Converts a key name to a key value.
     *
     * The names are the same as those in the
     * `gdk/gdkkeysyms.h` header file
     * but without the leading “GDK_KEY_”.
     *
     * @param keyvalName a key name
     * @return the corresponding key value, or %GDK_KEY_VoidSymbol
     *   if the key name is not a valid key
     */
    public fun keyvalFromName(keyvalName: String): guint = gdk_keyval_from_name(keyvalName)

    /**
     * Returns true if the given key value is in lower case.
     *
     * @param keyval a key value.
     * @return true if @keyval is in lower case, or if @keyval is not
     *   subject to case conversion.
     */
    public fun keyvalIsLower(keyval: guint): Boolean = gdk_keyval_is_lower(keyval).asBoolean()

    /**
     * Returns true if the given key value is in upper case.
     *
     * @param keyval a key value.
     * @return true if @keyval is in upper case, or if @keyval is not subject to
     *  case conversion.
     */
    public fun keyvalIsUpper(keyval: guint): Boolean = gdk_keyval_is_upper(keyval).asBoolean()

    /**
     * Converts a key value into a symbolic name.
     *
     * The names are the same as those in the
     * `gdk/gdkkeysyms.h` header file
     * but without the leading “GDK_KEY_”.
     *
     * @param keyval a key value
     * @return a string containing the name
     *   of the key
     */
    public fun keyvalName(keyval: guint): String? = gdk_keyval_name(keyval)?.toKString()

    /**
     * Converts a key value to lower case, if applicable.
     *
     * @param keyval a key value.
     * @return the lower case form of @keyval, or @keyval itself if it is already
     *  in lower case or it is not subject to case conversion.
     */
    public fun keyvalToLower(keyval: guint): guint = gdk_keyval_to_lower(keyval)

    /**
     * Convert from a GDK key symbol to the corresponding Unicode
     * character.
     *
     * Note that the conversion does not take the current locale
     * into consideration, which might be expected for particular
     * keyvals, such as %GDK_KEY_KP_Decimal.
     *
     * @param keyval a GDK key symbol
     * @return the corresponding unicode character, or 0 if there
     *   is no corresponding character.
     */
    public fun keyvalToUnicode(keyval: guint): guint = gdk_keyval_to_unicode(keyval)

    /**
     * Converts a key value to upper case, if applicable.
     *
     * @param keyval a key value.
     * @return the upper case form of @keyval, or @keyval itself if it is already
     *   in upper case or it is not subject to case conversion.
     */
    public fun keyvalToUpper(keyval: guint): guint = gdk_keyval_to_upper(keyval)

    /**
     * Transfers image data from a `cairo_surface_t` and converts it
     * to a `GdkPixbuf`.
     *
     * This allows you to efficiently read individual pixels from cairo surfaces.
     *
     * This function will create an RGB pixbuf with 8 bits per channel.
     * The pixbuf will contain an alpha channel if the @surface contains one.
     *
     * @param surface surface to copy from
     * @param srcX Source X coordinate within @surface
     * @param srcY Source Y coordinate within @surface
     * @param width Width in pixels of region to get
     * @param height Height in pixels of region to get
     * @return A newly-created pixbuf with a
     *   reference count of 1
     */
    public fun pixbufGetFromSurface(
        surface: org.gtkkn.bindings.cairo.Surface,
        srcX: gint,
        srcY: gint,
        width: gint,
        height: gint,
    ): Pixbuf? = gdk_pixbuf_get_from_surface(surface.gPointer.reinterpret(), srcX, srcY, width, height)?.run {
        Pixbuf(reinterpret())
    }

    /**
     * Creates a new pixbuf from @texture.
     *
     * This should generally not be used in newly written code as later
     * stages will almost certainly convert the pixbuf back into a texture
     * to draw it on screen.
     *
     * @param texture a `GdkTexture`
     * @return a new `GdkPixbuf`
     */
    public fun pixbufGetFromTexture(texture: Texture): Pixbuf? =
        gdk_pixbuf_get_from_texture(texture.gdkTexturePointer.reinterpret())?.run {
            Pixbuf(reinterpret())
        }

    /**
     * Sets a list of backends that GDK should try to use.
     *
     * This can be useful if your application does not
     * work with certain GDK backends.
     *
     * By default, GDK tries all included backends.
     *
     * For example:
     *
     * ```c
     * gdk_set_allowed_backends ("wayland,macos,*");
     * ```
     *
     * instructs GDK to try the Wayland backend first, followed by the
     * MacOs backend, and then all others.
     *
     * If the `GDK_BACKEND` environment variable is set, it determines
     * what backends are tried in what order, while still respecting the
     * set of allowed backends that are specified by this function.
     *
     * The possible backend names are:
     *
     *   - `broadway`
     *   - `macos`
     *   - `wayland`.
     *   - `win32`
     *   - `x11`
     *
     * You can also include a `*` in the list to try all remaining backends.
     *
     * This call must happen prior to functions that open a display, such
     * as [func@Gdk.Display.open], `gtk_init()`, or `gtk_init_check()`
     * in order to take effect.
     *
     * @param backends a comma-separated list of backends
     */
    public fun setAllowedBackends(backends: String): Unit = gdk_set_allowed_backends(backends)

    public fun toplevelSizeGetType(): GType = gdk_toplevel_size_get_type()

    /**
     * Convert from a Unicode character to a key symbol.
     *
     * @param wc a Unicode character
     * @return the corresponding GDK key symbol, if one exists.
     *   or, if there is no corresponding symbol, wc | 0x01000000
     */
    public fun unicodeToKeyval(wc: guint): guint = gdk_unicode_to_keyval(wc)

    public fun resolveException(error: Error): GLibException {
        val ex = when (error.domain) {
            DmabufError.quark() -> DmabufError.fromErrorOrNull(error)
                ?.let {
                    DmabufErrorException(error, it)
                }
            GlError.quark() -> GlError.fromErrorOrNull(error)
                ?.let {
                    GlErrorException(error, it)
                }
            TextureError.quark() -> TextureError.fromErrorOrNull(error)
                ?.let {
                    TextureErrorException(error, it)
                }
            VulkanError.quark() -> VulkanError.fromErrorOrNull(error)
                ?.let {
                    VulkanErrorException(error, it)
                }
            else -> null
        }
        return ex ?: GLibException(error)
    }
}

public val ContentDeserializeFuncFunc:
    CPointer<CFunction<(CPointer<GdkContentDeserializer>) -> Unit>> = staticCFunction {
            deserializer: CPointer<GdkContentDeserializer>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(deserializer: ContentDeserializer) -> Unit>().get().invoke(
            deserializer!!.run {
                ContentDeserializer(reinterpret())
            }
        )
    }
        .reinterpret()

public val ContentSerializeFuncFunc: CPointer<CFunction<(CPointer<GdkContentSerializer>) -> Unit>> =
    staticCFunction {
            serializer: CPointer<GdkContentSerializer>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(serializer: ContentSerializer) -> Unit>().get().invoke(
            serializer!!.run {
                ContentSerializer(reinterpret())
            }
        )
    }
        .reinterpret()

/**
 * The type of a function that can be registered with gdk_content_register_deserializer().
 *
 * When the function gets called to operate on content, it can call functions on the
 * @deserializer object to obtain the mime type, input stream, user data, etc. for its
 * operation.
 *
 * - param `deserializer` a `GdkContentDeserializer`
 */
public typealias ContentDeserializeFunc = (deserializer: ContentDeserializer) -> Unit

/**
 * The type of a function that can be registered with gdk_content_register_serializer().
 *
 * When the function gets called to operate on content, it can call functions on the
 * @serializer object to obtain the mime type, output stream, user data, etc. for its
 * operation.
 *
 * - param `serializer` a `GdkContentSerializer`
 */
public typealias ContentSerializeFunc = (serializer: ContentSerializer) -> Unit
