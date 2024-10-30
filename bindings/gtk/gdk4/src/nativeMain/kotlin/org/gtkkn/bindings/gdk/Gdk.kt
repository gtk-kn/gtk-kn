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
import org.gtkkn.bindings.gdkpixbuf.Pixbuf
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.InputStream
import org.gtkkn.bindings.gio.OutputStream
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.GlibException
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.native.gdk.GdkContentDeserializer
import org.gtkkn.native.gdk.GdkContentSerializer
import org.gtkkn.native.gdk.gdk_content_deserialize_async
import org.gtkkn.native.gdk.gdk_content_deserialize_finish
import org.gtkkn.native.gdk.gdk_content_formats_parse
import org.gtkkn.native.gdk.gdk_content_register_deserializer
import org.gtkkn.native.gdk.gdk_content_register_serializer
import org.gtkkn.native.gdk.gdk_content_serialize_async
import org.gtkkn.native.gdk.gdk_content_serialize_finish
import org.gtkkn.native.gdk.gdk_dmabuf_error_quark
import org.gtkkn.native.gdk.gdk_drag_action_is_unique
import org.gtkkn.native.gdk.gdk_drag_surface_size_get_type
import org.gtkkn.native.gdk.gdk_gl_error_quark
import org.gtkkn.native.gdk.gdk_intern_mime_type
import org.gtkkn.native.gdk.gdk_keyval_from_name
import org.gtkkn.native.gdk.gdk_keyval_is_lower
import org.gtkkn.native.gdk.gdk_keyval_is_upper
import org.gtkkn.native.gdk.gdk_keyval_name
import org.gtkkn.native.gdk.gdk_keyval_to_lower
import org.gtkkn.native.gdk.gdk_keyval_to_unicode
import org.gtkkn.native.gdk.gdk_keyval_to_upper
import org.gtkkn.native.gdk.gdk_paintable_new_empty
import org.gtkkn.native.gdk.gdk_pixbuf_get_from_texture
import org.gtkkn.native.gdk.gdk_set_allowed_backends
import org.gtkkn.native.gdk.gdk_texture_error_quark
import org.gtkkn.native.gdk.gdk_toplevel_size_get_type
import org.gtkkn.native.gdk.gdk_unicode_to_keyval
import org.gtkkn.native.gdk.gdk_vulkan_error_quark
import org.gtkkn.native.glib.GError
import kotlin.Boolean
import kotlin.Int
import kotlin.Result
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - parameter `cr`: cairo.Context
 * - parameter `cr`: cairo.Context
 * - parameter `cr`: cairo.Context
 * - parameter `surface`: cairo.Surface
 * - parameter `cr`: cairo.Context
 * - parameter `cr`: cairo.Context
 * - parameter `angle`: angle: Out parameter is not supported
 * - parameter `x`: x: Out parameter is not supported
 * - parameter `distance`: distance: Out parameter is not supported
 * - parameter `lower`: lower: Out parameter is not supported
 * - parameter `surface`: cairo.Surface
 * - record `ContentProviderClass`: glib type struct are ignored
 * - record `DevicePadInterface`: glib type struct are ignored
 * - record `DmabufTextureBuilderClass`: glib type struct are ignored
 * - record `DmabufTextureClass`: glib type struct are ignored
 * - record `DragSurfaceInterface`: glib type struct are ignored
 * - record `DragSurfaceSize`: Disguised records are ignored
 * - record `FrameClockClass`: glib type struct are ignored
 * - record `FrameClockPrivate`: Disguised records are ignored
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
 * - record `ToplevelSize`: Disguised records are ignored
 */
public object Gdk {
    /**
     * Defines all possible DND actions.
     *
     * This can be used in [method@Gdk.Drop.status] messages when any drop
     * can be accepted or a more specific drop method is not yet known.
     */
    public const val ACTION_ALL: Int = 7

    /**
     * The middle button.
     */
    public const val BUTTON_MIDDLE: Int = 2

    /**
     * The primary button. This is typically the left mouse button, or the
     * right button in a left-handed setup.
     */
    public const val BUTTON_PRIMARY: Int = 1

    /**
     * The secondary button. This is typically the right mouse button, or the
     * left button in a left-handed setup.
     */
    public const val BUTTON_SECONDARY: Int = 3

    /**
     * Represents the current time, and can be used anywhere a time is expected.
     */
    public const val CURRENT_TIME: Int = 0

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

    public const val KEY_0: Int = 48

    public const val KEY_1: Int = 49

    public const val KEY_2: Int = 50

    public const val KEY_3: Int = 51

    public const val KEY_3270_AltCursor: Int = 64784

    public const val KEY_3270_Attn: Int = 64782

    public const val KEY_3270_BackTab: Int = 64773

    public const val KEY_3270_ChangeScreen: Int = 64793

    public const val KEY_3270_Copy: Int = 64789

    public const val KEY_3270_CursorBlink: Int = 64783

    public const val KEY_3270_CursorSelect: Int = 64796

    public const val KEY_3270_DeleteWord: Int = 64794

    public const val KEY_3270_Duplicate: Int = 64769

    public const val KEY_3270_Enter: Int = 64798

    public const val KEY_3270_EraseEOF: Int = 64774

    public const val KEY_3270_EraseInput: Int = 64775

    public const val KEY_3270_ExSelect: Int = 64795

    public const val KEY_3270_FieldMark: Int = 64770

    public const val KEY_3270_Ident: Int = 64787

    public const val KEY_3270_Jump: Int = 64786

    public const val KEY_3270_KeyClick: Int = 64785

    public const val KEY_3270_Left2: Int = 64772

    public const val KEY_3270_PA1: Int = 64778

    public const val KEY_3270_PA2: Int = 64779

    public const val KEY_3270_PA3: Int = 64780

    public const val KEY_3270_Play: Int = 64790

    public const val KEY_3270_PrintScreen: Int = 64797

    public const val KEY_3270_Quit: Int = 64777

    public const val KEY_3270_Record: Int = 64792

    public const val KEY_3270_Reset: Int = 64776

    public const val KEY_3270_Right2: Int = 64771

    public const val KEY_3270_Rule: Int = 64788

    public const val KEY_3270_Setup: Int = 64791

    public const val KEY_3270_Test: Int = 64781

    public const val KEY_4: Int = 52

    public const val KEY_5: Int = 53

    public const val KEY_6: Int = 54

    public const val KEY_7: Int = 55

    public const val KEY_8: Int = 56

    public const val KEY_9: Int = 57

    public const val KEY_A: Int = 65

    public const val KEY_AE: Int = 198

    public const val KEY_Aacute: Int = 193

    public const val KEY_Abelowdot: Int = 16785056

    public const val KEY_Abreve: Int = 451

    public const val KEY_Abreveacute: Int = 16785070

    public const val KEY_Abrevebelowdot: Int = 16785078

    public const val KEY_Abrevegrave: Int = 16785072

    public const val KEY_Abrevehook: Int = 16785074

    public const val KEY_Abrevetilde: Int = 16785076

    public const val KEY_AccessX_Enable: Int = 65136

    public const val KEY_AccessX_Feedback_Enable: Int = 65137

    public const val KEY_Acircumflex: Int = 194

    public const val KEY_Acircumflexacute: Int = 16785060

    public const val KEY_Acircumflexbelowdot: Int = 16785068

    public const val KEY_Acircumflexgrave: Int = 16785062

    public const val KEY_Acircumflexhook: Int = 16785064

    public const val KEY_Acircumflextilde: Int = 16785066

    public const val KEY_AddFavorite: Int = 269025081

    public const val KEY_Adiaeresis: Int = 196

    public const val KEY_Agrave: Int = 192

    public const val KEY_Ahook: Int = 16785058

    public const val KEY_Alt_L: Int = 65513

    public const val KEY_Alt_R: Int = 65514

    public const val KEY_Amacron: Int = 960

    public const val KEY_Aogonek: Int = 417

    public const val KEY_ApplicationLeft: Int = 269025104

    public const val KEY_ApplicationRight: Int = 269025105

    public const val KEY_Arabic_0: Int = 16778848

    public const val KEY_Arabic_1: Int = 16778849

    public const val KEY_Arabic_2: Int = 16778850

    public const val KEY_Arabic_3: Int = 16778851

    public const val KEY_Arabic_4: Int = 16778852

    public const val KEY_Arabic_5: Int = 16778853

    public const val KEY_Arabic_6: Int = 16778854

    public const val KEY_Arabic_7: Int = 16778855

    public const val KEY_Arabic_8: Int = 16778856

    public const val KEY_Arabic_9: Int = 16778857

    public const val KEY_Arabic_ain: Int = 1497

    public const val KEY_Arabic_alef: Int = 1479

    public const val KEY_Arabic_alefmaksura: Int = 1513

    public const val KEY_Arabic_beh: Int = 1480

    public const val KEY_Arabic_comma: Int = 1452

    public const val KEY_Arabic_dad: Int = 1494

    public const val KEY_Arabic_dal: Int = 1487

    public const val KEY_Arabic_damma: Int = 1519

    public const val KEY_Arabic_dammatan: Int = 1516

    public const val KEY_Arabic_ddal: Int = 16778888

    public const val KEY_Arabic_farsi_yeh: Int = 16778956

    public const val KEY_Arabic_fatha: Int = 1518

    public const val KEY_Arabic_fathatan: Int = 1515

    public const val KEY_Arabic_feh: Int = 1505

    public const val KEY_Arabic_fullstop: Int = 16778964

    public const val KEY_Arabic_gaf: Int = 16778927

    public const val KEY_Arabic_ghain: Int = 1498

    public const val KEY_Arabic_ha: Int = 1511

    public const val KEY_Arabic_hah: Int = 1485

    public const val KEY_Arabic_hamza: Int = 1473

    public const val KEY_Arabic_hamza_above: Int = 16778836

    public const val KEY_Arabic_hamza_below: Int = 16778837

    public const val KEY_Arabic_hamzaonalef: Int = 1475

    public const val KEY_Arabic_hamzaonwaw: Int = 1476

    public const val KEY_Arabic_hamzaonyeh: Int = 1478

    public const val KEY_Arabic_hamzaunderalef: Int = 1477

    public const val KEY_Arabic_heh: Int = 1511

    public const val KEY_Arabic_heh_doachashmee: Int = 16778942

    public const val KEY_Arabic_heh_goal: Int = 16778945

    public const val KEY_Arabic_jeem: Int = 1484

    public const val KEY_Arabic_jeh: Int = 16778904

    public const val KEY_Arabic_kaf: Int = 1507

    public const val KEY_Arabic_kasra: Int = 1520

    public const val KEY_Arabic_kasratan: Int = 1517

    public const val KEY_Arabic_keheh: Int = 16778921

    public const val KEY_Arabic_khah: Int = 1486

    public const val KEY_Arabic_lam: Int = 1508

    public const val KEY_Arabic_madda_above: Int = 16778835

    public const val KEY_Arabic_maddaonalef: Int = 1474

    public const val KEY_Arabic_meem: Int = 1509

    public const val KEY_Arabic_noon: Int = 1510

    public const val KEY_Arabic_noon_ghunna: Int = 16778938

    public const val KEY_Arabic_peh: Int = 16778878

    public const val KEY_Arabic_percent: Int = 16778858

    public const val KEY_Arabic_qaf: Int = 1506

    public const val KEY_Arabic_question_mark: Int = 1471

    public const val KEY_Arabic_ra: Int = 1489

    public const val KEY_Arabic_rreh: Int = 16778897

    public const val KEY_Arabic_sad: Int = 1493

    public const val KEY_Arabic_seen: Int = 1491

    public const val KEY_Arabic_semicolon: Int = 1467

    public const val KEY_Arabic_shadda: Int = 1521

    public const val KEY_Arabic_sheen: Int = 1492

    public const val KEY_Arabic_sukun: Int = 1522

    public const val KEY_Arabic_superscript_alef: Int = 16778864

    public const val KEY_Arabic_switch: Int = 65406

    public const val KEY_Arabic_tah: Int = 1495

    public const val KEY_Arabic_tatweel: Int = 1504

    public const val KEY_Arabic_tcheh: Int = 16778886

    public const val KEY_Arabic_teh: Int = 1482

    public const val KEY_Arabic_tehmarbuta: Int = 1481

    public const val KEY_Arabic_thal: Int = 1488

    public const val KEY_Arabic_theh: Int = 1483

    public const val KEY_Arabic_tteh: Int = 16778873

    public const val KEY_Arabic_veh: Int = 16778916

    public const val KEY_Arabic_waw: Int = 1512

    public const val KEY_Arabic_yeh: Int = 1514

    public const val KEY_Arabic_yeh_baree: Int = 16778962

    public const val KEY_Arabic_zah: Int = 1496

    public const val KEY_Arabic_zain: Int = 1490

    public const val KEY_Aring: Int = 197

    public const val KEY_Armenian_AT: Int = 16778552

    public const val KEY_Armenian_AYB: Int = 16778545

    public const val KEY_Armenian_BEN: Int = 16778546

    public const val KEY_Armenian_CHA: Int = 16778569

    public const val KEY_Armenian_DA: Int = 16778548

    public const val KEY_Armenian_DZA: Int = 16778561

    public const val KEY_Armenian_E: Int = 16778551

    public const val KEY_Armenian_FE: Int = 16778582

    public const val KEY_Armenian_GHAT: Int = 16778562

    public const val KEY_Armenian_GIM: Int = 16778547

    public const val KEY_Armenian_HI: Int = 16778565

    public const val KEY_Armenian_HO: Int = 16778560

    public const val KEY_Armenian_INI: Int = 16778555

    public const val KEY_Armenian_JE: Int = 16778571

    public const val KEY_Armenian_KE: Int = 16778580

    public const val KEY_Armenian_KEN: Int = 16778559

    public const val KEY_Armenian_KHE: Int = 16778557

    public const val KEY_Armenian_LYUN: Int = 16778556

    public const val KEY_Armenian_MEN: Int = 16778564

    public const val KEY_Armenian_NU: Int = 16778566

    public const val KEY_Armenian_O: Int = 16778581

    public const val KEY_Armenian_PE: Int = 16778570

    public const val KEY_Armenian_PYUR: Int = 16778579

    public const val KEY_Armenian_RA: Int = 16778572

    public const val KEY_Armenian_RE: Int = 16778576

    public const val KEY_Armenian_SE: Int = 16778573

    public const val KEY_Armenian_SHA: Int = 16778567

    public const val KEY_Armenian_TCHE: Int = 16778563

    public const val KEY_Armenian_TO: Int = 16778553

    public const val KEY_Armenian_TSA: Int = 16778558

    public const val KEY_Armenian_TSO: Int = 16778577

    public const val KEY_Armenian_TYUN: Int = 16778575

    public const val KEY_Armenian_VEV: Int = 16778574

    public const val KEY_Armenian_VO: Int = 16778568

    public const val KEY_Armenian_VYUN: Int = 16778578

    public const val KEY_Armenian_YECH: Int = 16778549

    public const val KEY_Armenian_ZA: Int = 16778550

    public const val KEY_Armenian_ZHE: Int = 16778554

    public const val KEY_Armenian_accent: Int = 16778587

    public const val KEY_Armenian_amanak: Int = 16778588

    public const val KEY_Armenian_apostrophe: Int = 16778586

    public const val KEY_Armenian_at: Int = 16778600

    public const val KEY_Armenian_ayb: Int = 16778593

    public const val KEY_Armenian_ben: Int = 16778594

    public const val KEY_Armenian_but: Int = 16778589

    public const val KEY_Armenian_cha: Int = 16778617

    public const val KEY_Armenian_da: Int = 16778596

    public const val KEY_Armenian_dza: Int = 16778609

    public const val KEY_Armenian_e: Int = 16778599

    public const val KEY_Armenian_exclam: Int = 16778588

    public const val KEY_Armenian_fe: Int = 16778630

    public const val KEY_Armenian_full_stop: Int = 16778633

    public const val KEY_Armenian_ghat: Int = 16778610

    public const val KEY_Armenian_gim: Int = 16778595

    public const val KEY_Armenian_hi: Int = 16778613

    public const val KEY_Armenian_ho: Int = 16778608

    public const val KEY_Armenian_hyphen: Int = 16778634

    public const val KEY_Armenian_ini: Int = 16778603

    public const val KEY_Armenian_je: Int = 16778619

    public const val KEY_Armenian_ke: Int = 16778628

    public const val KEY_Armenian_ken: Int = 16778607

    public const val KEY_Armenian_khe: Int = 16778605

    public const val KEY_Armenian_ligature_ew: Int = 16778631

    public const val KEY_Armenian_lyun: Int = 16778604

    public const val KEY_Armenian_men: Int = 16778612

    public const val KEY_Armenian_nu: Int = 16778614

    public const val KEY_Armenian_o: Int = 16778629

    public const val KEY_Armenian_paruyk: Int = 16778590

    public const val KEY_Armenian_pe: Int = 16778618

    public const val KEY_Armenian_pyur: Int = 16778627

    public const val KEY_Armenian_question: Int = 16778590

    public const val KEY_Armenian_ra: Int = 16778620

    public const val KEY_Armenian_re: Int = 16778624

    public const val KEY_Armenian_se: Int = 16778621

    public const val KEY_Armenian_separation_mark: Int = 16778589

    public const val KEY_Armenian_sha: Int = 16778615

    public const val KEY_Armenian_shesht: Int = 16778587

    public const val KEY_Armenian_tche: Int = 16778611

    public const val KEY_Armenian_to: Int = 16778601

    public const val KEY_Armenian_tsa: Int = 16778606

    public const val KEY_Armenian_tso: Int = 16778625

    public const val KEY_Armenian_tyun: Int = 16778623

    public const val KEY_Armenian_verjaket: Int = 16778633

    public const val KEY_Armenian_vev: Int = 16778622

    public const val KEY_Armenian_vo: Int = 16778616

    public const val KEY_Armenian_vyun: Int = 16778626

    public const val KEY_Armenian_yech: Int = 16778597

    public const val KEY_Armenian_yentamna: Int = 16778634

    public const val KEY_Armenian_za: Int = 16778598

    public const val KEY_Armenian_zhe: Int = 16778602

    public const val KEY_Atilde: Int = 195

    public const val KEY_AudibleBell_Enable: Int = 65146

    public const val KEY_AudioCycleTrack: Int = 269025179

    public const val KEY_AudioForward: Int = 269025175

    public const val KEY_AudioLowerVolume: Int = 269025041

    public const val KEY_AudioMedia: Int = 269025074

    public const val KEY_AudioMicMute: Int = 269025202

    public const val KEY_AudioMute: Int = 269025042

    public const val KEY_AudioNext: Int = 269025047

    public const val KEY_AudioPause: Int = 269025073

    public const val KEY_AudioPlay: Int = 269025044

    public const val KEY_AudioPreset: Int = 269025206

    public const val KEY_AudioPrev: Int = 269025046

    public const val KEY_AudioRaiseVolume: Int = 269025043

    public const val KEY_AudioRandomPlay: Int = 269025177

    public const val KEY_AudioRecord: Int = 269025052

    public const val KEY_AudioRepeat: Int = 269025176

    public const val KEY_AudioRewind: Int = 269025086

    public const val KEY_AudioStop: Int = 269025045

    public const val KEY_Away: Int = 269025165

    public const val KEY_B: Int = 66

    public const val KEY_Babovedot: Int = 16784898

    public const val KEY_Back: Int = 269025062

    public const val KEY_BackForward: Int = 269025087

    public const val KEY_BackSpace: Int = 65288

    public const val KEY_Battery: Int = 269025171

    public const val KEY_Begin: Int = 65368

    public const val KEY_Blue: Int = 269025190

    public const val KEY_Bluetooth: Int = 269025172

    public const val KEY_Book: Int = 269025106

    public const val KEY_BounceKeys_Enable: Int = 65140

    public const val KEY_Break: Int = 65387

    public const val KEY_BrightnessAdjust: Int = 269025083

    public const val KEY_Byelorussian_SHORTU: Int = 1726

    public const val KEY_Byelorussian_shortu: Int = 1710

    public const val KEY_C: Int = 67

    public const val KEY_CD: Int = 269025107

    public const val KEY_CH: Int = 65186

    public const val KEY_C_H: Int = 65189

    public const val KEY_C_h: Int = 65188

    public const val KEY_Cabovedot: Int = 709

    public const val KEY_Cacute: Int = 454

    public const val KEY_Calculator: Int = 269025053

    public const val KEY_Calendar: Int = 269025056

    public const val KEY_Cancel: Int = 65385

    public const val KEY_Caps_Lock: Int = 65509

    public const val KEY_Ccaron: Int = 456

    public const val KEY_Ccedilla: Int = 199

    public const val KEY_Ccircumflex: Int = 710

    public const val KEY_Ch: Int = 65185

    public const val KEY_Clear: Int = 65291

    public const val KEY_ClearGrab: Int = 269024801

    public const val KEY_Close: Int = 269025110

    public const val KEY_Codeinput: Int = 65335

    public const val KEY_ColonSign: Int = 16785569

    public const val KEY_Community: Int = 269025085

    public const val KEY_ContrastAdjust: Int = 269025058

    public const val KEY_Control_L: Int = 65507

    public const val KEY_Control_R: Int = 65508

    public const val KEY_Copy: Int = 269025111

    public const val KEY_CruzeiroSign: Int = 16785570

    public const val KEY_Cut: Int = 269025112

    public const val KEY_CycleAngle: Int = 269025180

    public const val KEY_Cyrillic_A: Int = 1761

    public const val KEY_Cyrillic_BE: Int = 1762

    public const val KEY_Cyrillic_CHE: Int = 1790

    public const val KEY_Cyrillic_CHE_descender: Int = 16778422

    public const val KEY_Cyrillic_CHE_vertstroke: Int = 16778424

    public const val KEY_Cyrillic_DE: Int = 1764

    public const val KEY_Cyrillic_DZHE: Int = 1727

    public const val KEY_Cyrillic_E: Int = 1788

    public const val KEY_Cyrillic_EF: Int = 1766

    public const val KEY_Cyrillic_EL: Int = 1772

    public const val KEY_Cyrillic_EM: Int = 1773

    public const val KEY_Cyrillic_EN: Int = 1774

    public const val KEY_Cyrillic_EN_descender: Int = 16778402

    public const val KEY_Cyrillic_ER: Int = 1778

    public const val KEY_Cyrillic_ES: Int = 1779

    public const val KEY_Cyrillic_GHE: Int = 1767

    public const val KEY_Cyrillic_GHE_bar: Int = 16778386

    public const val KEY_Cyrillic_HA: Int = 1768

    public const val KEY_Cyrillic_HARDSIGN: Int = 1791

    public const val KEY_Cyrillic_HA_descender: Int = 16778418

    public const val KEY_Cyrillic_I: Int = 1769

    public const val KEY_Cyrillic_IE: Int = 1765

    public const val KEY_Cyrillic_IO: Int = 1715

    public const val KEY_Cyrillic_I_macron: Int = 16778466

    public const val KEY_Cyrillic_JE: Int = 1720

    public const val KEY_Cyrillic_KA: Int = 1771

    public const val KEY_Cyrillic_KA_descender: Int = 16778394

    public const val KEY_Cyrillic_KA_vertstroke: Int = 16778396

    public const val KEY_Cyrillic_LJE: Int = 1721

    public const val KEY_Cyrillic_NJE: Int = 1722

    public const val KEY_Cyrillic_O: Int = 1775

    public const val KEY_Cyrillic_O_bar: Int = 16778472

    public const val KEY_Cyrillic_PE: Int = 1776

    public const val KEY_Cyrillic_SCHWA: Int = 16778456

    public const val KEY_Cyrillic_SHA: Int = 1787

    public const val KEY_Cyrillic_SHCHA: Int = 1789

    public const val KEY_Cyrillic_SHHA: Int = 16778426

    public const val KEY_Cyrillic_SHORTI: Int = 1770

    public const val KEY_Cyrillic_SOFTSIGN: Int = 1784

    public const val KEY_Cyrillic_TE: Int = 1780

    public const val KEY_Cyrillic_TSE: Int = 1763

    public const val KEY_Cyrillic_U: Int = 1781

    public const val KEY_Cyrillic_U_macron: Int = 16778478

    public const val KEY_Cyrillic_U_straight: Int = 16778414

    public const val KEY_Cyrillic_U_straight_bar: Int = 16778416

    public const val KEY_Cyrillic_VE: Int = 1783

    public const val KEY_Cyrillic_YA: Int = 1777

    public const val KEY_Cyrillic_YERU: Int = 1785

    public const val KEY_Cyrillic_YU: Int = 1760

    public const val KEY_Cyrillic_ZE: Int = 1786

    public const val KEY_Cyrillic_ZHE: Int = 1782

    public const val KEY_Cyrillic_ZHE_descender: Int = 16778390

    public const val KEY_Cyrillic_a: Int = 1729

    public const val KEY_Cyrillic_be: Int = 1730

    public const val KEY_Cyrillic_che: Int = 1758

    public const val KEY_Cyrillic_che_descender: Int = 16778423

    public const val KEY_Cyrillic_che_vertstroke: Int = 16778425

    public const val KEY_Cyrillic_de: Int = 1732

    public const val KEY_Cyrillic_dzhe: Int = 1711

    public const val KEY_Cyrillic_e: Int = 1756

    public const val KEY_Cyrillic_ef: Int = 1734

    public const val KEY_Cyrillic_el: Int = 1740

    public const val KEY_Cyrillic_em: Int = 1741

    public const val KEY_Cyrillic_en: Int = 1742

    public const val KEY_Cyrillic_en_descender: Int = 16778403

    public const val KEY_Cyrillic_er: Int = 1746

    public const val KEY_Cyrillic_es: Int = 1747

    public const val KEY_Cyrillic_ghe: Int = 1735

    public const val KEY_Cyrillic_ghe_bar: Int = 16778387

    public const val KEY_Cyrillic_ha: Int = 1736

    public const val KEY_Cyrillic_ha_descender: Int = 16778419

    public const val KEY_Cyrillic_hardsign: Int = 1759

    public const val KEY_Cyrillic_i: Int = 1737

    public const val KEY_Cyrillic_i_macron: Int = 16778467

    public const val KEY_Cyrillic_ie: Int = 1733

    public const val KEY_Cyrillic_io: Int = 1699

    public const val KEY_Cyrillic_je: Int = 1704

    public const val KEY_Cyrillic_ka: Int = 1739

    public const val KEY_Cyrillic_ka_descender: Int = 16778395

    public const val KEY_Cyrillic_ka_vertstroke: Int = 16778397

    public const val KEY_Cyrillic_lje: Int = 1705

    public const val KEY_Cyrillic_nje: Int = 1706

    public const val KEY_Cyrillic_o: Int = 1743

    public const val KEY_Cyrillic_o_bar: Int = 16778473

    public const val KEY_Cyrillic_pe: Int = 1744

    public const val KEY_Cyrillic_schwa: Int = 16778457

    public const val KEY_Cyrillic_sha: Int = 1755

    public const val KEY_Cyrillic_shcha: Int = 1757

    public const val KEY_Cyrillic_shha: Int = 16778427

    public const val KEY_Cyrillic_shorti: Int = 1738

    public const val KEY_Cyrillic_softsign: Int = 1752

    public const val KEY_Cyrillic_te: Int = 1748

    public const val KEY_Cyrillic_tse: Int = 1731

    public const val KEY_Cyrillic_u: Int = 1749

    public const val KEY_Cyrillic_u_macron: Int = 16778479

    public const val KEY_Cyrillic_u_straight: Int = 16778415

    public const val KEY_Cyrillic_u_straight_bar: Int = 16778417

    public const val KEY_Cyrillic_ve: Int = 1751

    public const val KEY_Cyrillic_ya: Int = 1745

    public const val KEY_Cyrillic_yeru: Int = 1753

    public const val KEY_Cyrillic_yu: Int = 1728

    public const val KEY_Cyrillic_ze: Int = 1754

    public const val KEY_Cyrillic_zhe: Int = 1750

    public const val KEY_Cyrillic_zhe_descender: Int = 16778391

    public const val KEY_D: Int = 68

    public const val KEY_DOS: Int = 269025114

    public const val KEY_Dabovedot: Int = 16784906

    public const val KEY_Dcaron: Int = 463

    public const val KEY_Delete: Int = 65535

    public const val KEY_Display: Int = 269025113

    public const val KEY_Documents: Int = 269025115

    public const val KEY_DongSign: Int = 16785579

    public const val KEY_Down: Int = 65364

    public const val KEY_Dstroke: Int = 464

    public const val KEY_E: Int = 69

    public const val KEY_ENG: Int = 957

    public const val KEY_ETH: Int = 208

    public const val KEY_EZH: Int = 16777655

    public const val KEY_Eabovedot: Int = 972

    public const val KEY_Eacute: Int = 201

    public const val KEY_Ebelowdot: Int = 16785080

    public const val KEY_Ecaron: Int = 460

    public const val KEY_Ecircumflex: Int = 202

    public const val KEY_Ecircumflexacute: Int = 16785086

    public const val KEY_Ecircumflexbelowdot: Int = 16785094

    public const val KEY_Ecircumflexgrave: Int = 16785088

    public const val KEY_Ecircumflexhook: Int = 16785090

    public const val KEY_Ecircumflextilde: Int = 16785092

    public const val KEY_EcuSign: Int = 16785568

    public const val KEY_Ediaeresis: Int = 203

    public const val KEY_Egrave: Int = 200

    public const val KEY_Ehook: Int = 16785082

    public const val KEY_Eisu_Shift: Int = 65327

    public const val KEY_Eisu_toggle: Int = 65328

    public const val KEY_Eject: Int = 269025068

    public const val KEY_Emacron: Int = 938

    public const val KEY_End: Int = 65367

    public const val KEY_Eogonek: Int = 458

    public const val KEY_Escape: Int = 65307

    public const val KEY_Eth: Int = 208

    public const val KEY_Etilde: Int = 16785084

    public const val KEY_EuroSign: Int = 8364

    public const val KEY_Excel: Int = 269025116

    public const val KEY_Execute: Int = 65378

    public const val KEY_Explorer: Int = 269025117

    public const val KEY_F: Int = 70

    public const val KEY_F1: Int = 65470

    public const val KEY_F10: Int = 65479

    public const val KEY_F11: Int = 65480

    public const val KEY_F12: Int = 65481

    public const val KEY_F13: Int = 65482

    public const val KEY_F14: Int = 65483

    public const val KEY_F15: Int = 65484

    public const val KEY_F16: Int = 65485

    public const val KEY_F17: Int = 65486

    public const val KEY_F18: Int = 65487

    public const val KEY_F19: Int = 65488

    public const val KEY_F2: Int = 65471

    public const val KEY_F20: Int = 65489

    public const val KEY_F21: Int = 65490

    public const val KEY_F22: Int = 65491

    public const val KEY_F23: Int = 65492

    public const val KEY_F24: Int = 65493

    public const val KEY_F25: Int = 65494

    public const val KEY_F26: Int = 65495

    public const val KEY_F27: Int = 65496

    public const val KEY_F28: Int = 65497

    public const val KEY_F29: Int = 65498

    public const val KEY_F3: Int = 65472

    public const val KEY_F30: Int = 65499

    public const val KEY_F31: Int = 65500

    public const val KEY_F32: Int = 65501

    public const val KEY_F33: Int = 65502

    public const val KEY_F34: Int = 65503

    public const val KEY_F35: Int = 65504

    public const val KEY_F4: Int = 65473

    public const val KEY_F5: Int = 65474

    public const val KEY_F6: Int = 65475

    public const val KEY_F7: Int = 65476

    public const val KEY_F8: Int = 65477

    public const val KEY_F9: Int = 65478

    public const val KEY_FFrancSign: Int = 16785571

    public const val KEY_Fabovedot: Int = 16784926

    public const val KEY_Farsi_0: Int = 16778992

    public const val KEY_Farsi_1: Int = 16778993

    public const val KEY_Farsi_2: Int = 16778994

    public const val KEY_Farsi_3: Int = 16778995

    public const val KEY_Farsi_4: Int = 16778996

    public const val KEY_Farsi_5: Int = 16778997

    public const val KEY_Farsi_6: Int = 16778998

    public const val KEY_Farsi_7: Int = 16778999

    public const val KEY_Farsi_8: Int = 16779000

    public const val KEY_Farsi_9: Int = 16779001

    public const val KEY_Farsi_yeh: Int = 16778956

    public const val KEY_Favorites: Int = 269025072

    public const val KEY_Finance: Int = 269025084

    public const val KEY_Find: Int = 65384

    public const val KEY_First_Virtual_Screen: Int = 65232

    public const val KEY_Forward: Int = 269025063

    public const val KEY_FrameBack: Int = 269025181

    public const val KEY_FrameForward: Int = 269025182

    public const val KEY_G: Int = 71

    public const val KEY_Gabovedot: Int = 725

    public const val KEY_Game: Int = 269025118

    public const val KEY_Gbreve: Int = 683

    public const val KEY_Gcaron: Int = 16777702

    public const val KEY_Gcedilla: Int = 939

    public const val KEY_Gcircumflex: Int = 728

    public const val KEY_Georgian_an: Int = 16781520

    public const val KEY_Georgian_ban: Int = 16781521

    public const val KEY_Georgian_can: Int = 16781546

    public const val KEY_Georgian_char: Int = 16781549

    public const val KEY_Georgian_chin: Int = 16781545

    public const val KEY_Georgian_cil: Int = 16781548

    public const val KEY_Georgian_don: Int = 16781523

    public const val KEY_Georgian_en: Int = 16781524

    public const val KEY_Georgian_fi: Int = 16781558

    public const val KEY_Georgian_gan: Int = 16781522

    public const val KEY_Georgian_ghan: Int = 16781542

    public const val KEY_Georgian_hae: Int = 16781552

    public const val KEY_Georgian_har: Int = 16781556

    public const val KEY_Georgian_he: Int = 16781553

    public const val KEY_Georgian_hie: Int = 16781554

    public const val KEY_Georgian_hoe: Int = 16781557

    public const val KEY_Georgian_in: Int = 16781528

    public const val KEY_Georgian_jhan: Int = 16781551

    public const val KEY_Georgian_jil: Int = 16781547

    public const val KEY_Georgian_kan: Int = 16781529

    public const val KEY_Georgian_khar: Int = 16781541

    public const val KEY_Georgian_las: Int = 16781530

    public const val KEY_Georgian_man: Int = 16781531

    public const val KEY_Georgian_nar: Int = 16781532

    public const val KEY_Georgian_on: Int = 16781533

    public const val KEY_Georgian_par: Int = 16781534

    public const val KEY_Georgian_phar: Int = 16781540

    public const val KEY_Georgian_qar: Int = 16781543

    public const val KEY_Georgian_rae: Int = 16781536

    public const val KEY_Georgian_san: Int = 16781537

    public const val KEY_Georgian_shin: Int = 16781544

    public const val KEY_Georgian_tan: Int = 16781527

    public const val KEY_Georgian_tar: Int = 16781538

    public const val KEY_Georgian_un: Int = 16781539

    public const val KEY_Georgian_vin: Int = 16781525

    public const val KEY_Georgian_we: Int = 16781555

    public const val KEY_Georgian_xan: Int = 16781550

    public const val KEY_Georgian_zen: Int = 16781526

    public const val KEY_Georgian_zhar: Int = 16781535

    public const val KEY_Go: Int = 269025119

    public const val KEY_Greek_ALPHA: Int = 1985

    public const val KEY_Greek_ALPHAaccent: Int = 1953

    public const val KEY_Greek_BETA: Int = 1986

    public const val KEY_Greek_CHI: Int = 2007

    public const val KEY_Greek_DELTA: Int = 1988

    public const val KEY_Greek_EPSILON: Int = 1989

    public const val KEY_Greek_EPSILONaccent: Int = 1954

    public const val KEY_Greek_ETA: Int = 1991

    public const val KEY_Greek_ETAaccent: Int = 1955

    public const val KEY_Greek_GAMMA: Int = 1987

    public const val KEY_Greek_IOTA: Int = 1993

    public const val KEY_Greek_IOTAaccent: Int = 1956

    public const val KEY_Greek_IOTAdiaeresis: Int = 1957

    public const val KEY_Greek_IOTAdieresis: Int = 1957

    public const val KEY_Greek_KAPPA: Int = 1994

    public const val KEY_Greek_LAMBDA: Int = 1995

    public const val KEY_Greek_LAMDA: Int = 1995

    public const val KEY_Greek_MU: Int = 1996

    public const val KEY_Greek_NU: Int = 1997

    public const val KEY_Greek_OMEGA: Int = 2009

    public const val KEY_Greek_OMEGAaccent: Int = 1963

    public const val KEY_Greek_OMICRON: Int = 1999

    public const val KEY_Greek_OMICRONaccent: Int = 1959

    public const val KEY_Greek_PHI: Int = 2006

    public const val KEY_Greek_PI: Int = 2000

    public const val KEY_Greek_PSI: Int = 2008

    public const val KEY_Greek_RHO: Int = 2001

    public const val KEY_Greek_SIGMA: Int = 2002

    public const val KEY_Greek_TAU: Int = 2004

    public const val KEY_Greek_THETA: Int = 1992

    public const val KEY_Greek_UPSILON: Int = 2005

    public const val KEY_Greek_UPSILONaccent: Int = 1960

    public const val KEY_Greek_UPSILONdieresis: Int = 1961

    public const val KEY_Greek_XI: Int = 1998

    public const val KEY_Greek_ZETA: Int = 1990

    public const val KEY_Greek_accentdieresis: Int = 1966

    public const val KEY_Greek_alpha: Int = 2017

    public const val KEY_Greek_alphaaccent: Int = 1969

    public const val KEY_Greek_beta: Int = 2018

    public const val KEY_Greek_chi: Int = 2039

    public const val KEY_Greek_delta: Int = 2020

    public const val KEY_Greek_epsilon: Int = 2021

    public const val KEY_Greek_epsilonaccent: Int = 1970

    public const val KEY_Greek_eta: Int = 2023

    public const val KEY_Greek_etaaccent: Int = 1971

    public const val KEY_Greek_finalsmallsigma: Int = 2035

    public const val KEY_Greek_gamma: Int = 2019

    public const val KEY_Greek_horizbar: Int = 1967

    public const val KEY_Greek_iota: Int = 2025

    public const val KEY_Greek_iotaaccent: Int = 1972

    public const val KEY_Greek_iotaaccentdieresis: Int = 1974

    public const val KEY_Greek_iotadieresis: Int = 1973

    public const val KEY_Greek_kappa: Int = 2026

    public const val KEY_Greek_lambda: Int = 2027

    public const val KEY_Greek_lamda: Int = 2027

    public const val KEY_Greek_mu: Int = 2028

    public const val KEY_Greek_nu: Int = 2029

    public const val KEY_Greek_omega: Int = 2041

    public const val KEY_Greek_omegaaccent: Int = 1979

    public const val KEY_Greek_omicron: Int = 2031

    public const val KEY_Greek_omicronaccent: Int = 1975

    public const val KEY_Greek_phi: Int = 2038

    public const val KEY_Greek_pi: Int = 2032

    public const val KEY_Greek_psi: Int = 2040

    public const val KEY_Greek_rho: Int = 2033

    public const val KEY_Greek_sigma: Int = 2034

    public const val KEY_Greek_switch: Int = 65406

    public const val KEY_Greek_tau: Int = 2036

    public const val KEY_Greek_theta: Int = 2024

    public const val KEY_Greek_upsilon: Int = 2037

    public const val KEY_Greek_upsilonaccent: Int = 1976

    public const val KEY_Greek_upsilonaccentdieresis: Int = 1978

    public const val KEY_Greek_upsilondieresis: Int = 1977

    public const val KEY_Greek_xi: Int = 2030

    public const val KEY_Greek_zeta: Int = 2022

    public const val KEY_Green: Int = 269025188

    public const val KEY_H: Int = 72

    public const val KEY_Hangul: Int = 65329

    public const val KEY_Hangul_A: Int = 3775

    public const val KEY_Hangul_AE: Int = 3776

    public const val KEY_Hangul_AraeA: Int = 3830

    public const val KEY_Hangul_AraeAE: Int = 3831

    public const val KEY_Hangul_Banja: Int = 65337

    public const val KEY_Hangul_Cieuc: Int = 3770

    public const val KEY_Hangul_Codeinput: Int = 65335

    public const val KEY_Hangul_Dikeud: Int = 3751

    public const val KEY_Hangul_E: Int = 3780

    public const val KEY_Hangul_EO: Int = 3779

    public const val KEY_Hangul_EU: Int = 3793

    public const val KEY_Hangul_End: Int = 65331

    public const val KEY_Hangul_Hanja: Int = 65332

    public const val KEY_Hangul_Hieuh: Int = 3774

    public const val KEY_Hangul_I: Int = 3795

    public const val KEY_Hangul_Ieung: Int = 3767

    public const val KEY_Hangul_J_Cieuc: Int = 3818

    public const val KEY_Hangul_J_Dikeud: Int = 3802

    public const val KEY_Hangul_J_Hieuh: Int = 3822

    public const val KEY_Hangul_J_Ieung: Int = 3816

    public const val KEY_Hangul_J_Jieuj: Int = 3817

    public const val KEY_Hangul_J_Khieuq: Int = 3819

    public const val KEY_Hangul_J_Kiyeog: Int = 3796

    public const val KEY_Hangul_J_KiyeogSios: Int = 3798

    public const val KEY_Hangul_J_KkogjiDalrinIeung: Int = 3833

    public const val KEY_Hangul_J_Mieum: Int = 3811

    public const val KEY_Hangul_J_Nieun: Int = 3799

    public const val KEY_Hangul_J_NieunHieuh: Int = 3801

    public const val KEY_Hangul_J_NieunJieuj: Int = 3800

    public const val KEY_Hangul_J_PanSios: Int = 3832

    public const val KEY_Hangul_J_Phieuf: Int = 3821

    public const val KEY_Hangul_J_Pieub: Int = 3812

    public const val KEY_Hangul_J_PieubSios: Int = 3813

    public const val KEY_Hangul_J_Rieul: Int = 3803

    public const val KEY_Hangul_J_RieulHieuh: Int = 3810

    public const val KEY_Hangul_J_RieulKiyeog: Int = 3804

    public const val KEY_Hangul_J_RieulMieum: Int = 3805

    public const val KEY_Hangul_J_RieulPhieuf: Int = 3809

    public const val KEY_Hangul_J_RieulPieub: Int = 3806

    public const val KEY_Hangul_J_RieulSios: Int = 3807

    public const val KEY_Hangul_J_RieulTieut: Int = 3808

    public const val KEY_Hangul_J_Sios: Int = 3814

    public const val KEY_Hangul_J_SsangKiyeog: Int = 3797

    public const val KEY_Hangul_J_SsangSios: Int = 3815

    public const val KEY_Hangul_J_Tieut: Int = 3820

    public const val KEY_Hangul_J_YeorinHieuh: Int = 3834

    public const val KEY_Hangul_Jamo: Int = 65333

    public const val KEY_Hangul_Jeonja: Int = 65336

    public const val KEY_Hangul_Jieuj: Int = 3768

    public const val KEY_Hangul_Khieuq: Int = 3771

    public const val KEY_Hangul_Kiyeog: Int = 3745

    public const val KEY_Hangul_KiyeogSios: Int = 3747

    public const val KEY_Hangul_KkogjiDalrinIeung: Int = 3827

    public const val KEY_Hangul_Mieum: Int = 3761

    public const val KEY_Hangul_MultipleCandidate: Int = 65341

    public const val KEY_Hangul_Nieun: Int = 3748

    public const val KEY_Hangul_NieunHieuh: Int = 3750

    public const val KEY_Hangul_NieunJieuj: Int = 3749

    public const val KEY_Hangul_O: Int = 3783

    public const val KEY_Hangul_OE: Int = 3786

    public const val KEY_Hangul_PanSios: Int = 3826

    public const val KEY_Hangul_Phieuf: Int = 3773

    public const val KEY_Hangul_Pieub: Int = 3762

    public const val KEY_Hangul_PieubSios: Int = 3764

    public const val KEY_Hangul_PostHanja: Int = 65339

    public const val KEY_Hangul_PreHanja: Int = 65338

    public const val KEY_Hangul_PreviousCandidate: Int = 65342

    public const val KEY_Hangul_Rieul: Int = 3753

    public const val KEY_Hangul_RieulHieuh: Int = 3760

    public const val KEY_Hangul_RieulKiyeog: Int = 3754

    public const val KEY_Hangul_RieulMieum: Int = 3755

    public const val KEY_Hangul_RieulPhieuf: Int = 3759

    public const val KEY_Hangul_RieulPieub: Int = 3756

    public const val KEY_Hangul_RieulSios: Int = 3757

    public const val KEY_Hangul_RieulTieut: Int = 3758

    public const val KEY_Hangul_RieulYeorinHieuh: Int = 3823

    public const val KEY_Hangul_Romaja: Int = 65334

    public const val KEY_Hangul_SingleCandidate: Int = 65340

    public const val KEY_Hangul_Sios: Int = 3765

    public const val KEY_Hangul_Special: Int = 65343

    public const val KEY_Hangul_SsangDikeud: Int = 3752

    public const val KEY_Hangul_SsangJieuj: Int = 3769

    public const val KEY_Hangul_SsangKiyeog: Int = 3746

    public const val KEY_Hangul_SsangPieub: Int = 3763

    public const val KEY_Hangul_SsangSios: Int = 3766

    public const val KEY_Hangul_Start: Int = 65330

    public const val KEY_Hangul_SunkyeongeumMieum: Int = 3824

    public const val KEY_Hangul_SunkyeongeumPhieuf: Int = 3828

    public const val KEY_Hangul_SunkyeongeumPieub: Int = 3825

    public const val KEY_Hangul_Tieut: Int = 3772

    public const val KEY_Hangul_U: Int = 3788

    public const val KEY_Hangul_WA: Int = 3784

    public const val KEY_Hangul_WAE: Int = 3785

    public const val KEY_Hangul_WE: Int = 3790

    public const val KEY_Hangul_WEO: Int = 3789

    public const val KEY_Hangul_WI: Int = 3791

    public const val KEY_Hangul_YA: Int = 3777

    public const val KEY_Hangul_YAE: Int = 3778

    public const val KEY_Hangul_YE: Int = 3782

    public const val KEY_Hangul_YEO: Int = 3781

    public const val KEY_Hangul_YI: Int = 3794

    public const val KEY_Hangul_YO: Int = 3787

    public const val KEY_Hangul_YU: Int = 3792

    public const val KEY_Hangul_YeorinHieuh: Int = 3829

    public const val KEY_Hangul_switch: Int = 65406

    public const val KEY_Hankaku: Int = 65321

    public const val KEY_Hcircumflex: Int = 678

    public const val KEY_Hebrew_switch: Int = 65406

    public const val KEY_Help: Int = 65386

    public const val KEY_Henkan: Int = 65315

    public const val KEY_Henkan_Mode: Int = 65315

    public const val KEY_Hibernate: Int = 269025192

    public const val KEY_Hiragana: Int = 65317

    public const val KEY_Hiragana_Katakana: Int = 65319

    public const val KEY_History: Int = 269025079

    public const val KEY_Home: Int = 65360

    public const val KEY_HomePage: Int = 269025048

    public const val KEY_HotLinks: Int = 269025082

    public const val KEY_Hstroke: Int = 673

    public const val KEY_Hyper_L: Int = 65517

    public const val KEY_Hyper_R: Int = 65518

    public const val KEY_I: Int = 73

    public const val KEY_ISO_Center_Object: Int = 65075

    public const val KEY_ISO_Continuous_Underline: Int = 65072

    public const val KEY_ISO_Discontinuous_Underline: Int = 65073

    public const val KEY_ISO_Emphasize: Int = 65074

    public const val KEY_ISO_Enter: Int = 65076

    public const val KEY_ISO_Fast_Cursor_Down: Int = 65071

    public const val KEY_ISO_Fast_Cursor_Left: Int = 65068

    public const val KEY_ISO_Fast_Cursor_Right: Int = 65069

    public const val KEY_ISO_Fast_Cursor_Up: Int = 65070

    public const val KEY_ISO_First_Group: Int = 65036

    public const val KEY_ISO_First_Group_Lock: Int = 65037

    public const val KEY_ISO_Group_Latch: Int = 65030

    public const val KEY_ISO_Group_Lock: Int = 65031

    public const val KEY_ISO_Group_Shift: Int = 65406

    public const val KEY_ISO_Last_Group: Int = 65038

    public const val KEY_ISO_Last_Group_Lock: Int = 65039

    public const val KEY_ISO_Left_Tab: Int = 65056

    public const val KEY_ISO_Level2_Latch: Int = 65026

    public const val KEY_ISO_Level3_Latch: Int = 65028

    public const val KEY_ISO_Level3_Lock: Int = 65029

    public const val KEY_ISO_Level3_Shift: Int = 65027

    public const val KEY_ISO_Level5_Latch: Int = 65042

    public const val KEY_ISO_Level5_Lock: Int = 65043

    public const val KEY_ISO_Level5_Shift: Int = 65041

    public const val KEY_ISO_Lock: Int = 65025

    public const val KEY_ISO_Move_Line_Down: Int = 65058

    public const val KEY_ISO_Move_Line_Up: Int = 65057

    public const val KEY_ISO_Next_Group: Int = 65032

    public const val KEY_ISO_Next_Group_Lock: Int = 65033

    public const val KEY_ISO_Partial_Line_Down: Int = 65060

    public const val KEY_ISO_Partial_Line_Up: Int = 65059

    public const val KEY_ISO_Partial_Space_Left: Int = 65061

    public const val KEY_ISO_Partial_Space_Right: Int = 65062

    public const val KEY_ISO_Prev_Group: Int = 65034

    public const val KEY_ISO_Prev_Group_Lock: Int = 65035

    public const val KEY_ISO_Release_Both_Margins: Int = 65067

    public const val KEY_ISO_Release_Margin_Left: Int = 65065

    public const val KEY_ISO_Release_Margin_Right: Int = 65066

    public const val KEY_ISO_Set_Margin_Left: Int = 65063

    public const val KEY_ISO_Set_Margin_Right: Int = 65064

    public const val KEY_Iabovedot: Int = 681

    public const val KEY_Iacute: Int = 205

    public const val KEY_Ibelowdot: Int = 16785098

    public const val KEY_Ibreve: Int = 16777516

    public const val KEY_Icircumflex: Int = 206

    public const val KEY_Idiaeresis: Int = 207

    public const val KEY_Igrave: Int = 204

    public const val KEY_Ihook: Int = 16785096

    public const val KEY_Imacron: Int = 975

    public const val KEY_Insert: Int = 65379

    public const val KEY_Iogonek: Int = 967

    public const val KEY_Itilde: Int = 933

    public const val KEY_J: Int = 74

    public const val KEY_Jcircumflex: Int = 684

    public const val KEY_K: Int = 75

    public const val KEY_KP_0: Int = 65456

    public const val KEY_KP_1: Int = 65457

    public const val KEY_KP_2: Int = 65458

    public const val KEY_KP_3: Int = 65459

    public const val KEY_KP_4: Int = 65460

    public const val KEY_KP_5: Int = 65461

    public const val KEY_KP_6: Int = 65462

    public const val KEY_KP_7: Int = 65463

    public const val KEY_KP_8: Int = 65464

    public const val KEY_KP_9: Int = 65465

    public const val KEY_KP_Add: Int = 65451

    public const val KEY_KP_Begin: Int = 65437

    public const val KEY_KP_Decimal: Int = 65454

    public const val KEY_KP_Delete: Int = 65439

    public const val KEY_KP_Divide: Int = 65455

    public const val KEY_KP_Down: Int = 65433

    public const val KEY_KP_End: Int = 65436

    public const val KEY_KP_Enter: Int = 65421

    public const val KEY_KP_Equal: Int = 65469

    public const val KEY_KP_F1: Int = 65425

    public const val KEY_KP_F2: Int = 65426

    public const val KEY_KP_F3: Int = 65427

    public const val KEY_KP_F4: Int = 65428

    public const val KEY_KP_Home: Int = 65429

    public const val KEY_KP_Insert: Int = 65438

    public const val KEY_KP_Left: Int = 65430

    public const val KEY_KP_Multiply: Int = 65450

    public const val KEY_KP_Next: Int = 65435

    public const val KEY_KP_Page_Down: Int = 65435

    public const val KEY_KP_Page_Up: Int = 65434

    public const val KEY_KP_Prior: Int = 65434

    public const val KEY_KP_Right: Int = 65432

    public const val KEY_KP_Separator: Int = 65452

    public const val KEY_KP_Space: Int = 65408

    public const val KEY_KP_Subtract: Int = 65453

    public const val KEY_KP_Tab: Int = 65417

    public const val KEY_KP_Up: Int = 65431

    public const val KEY_Kana_Lock: Int = 65325

    public const val KEY_Kana_Shift: Int = 65326

    public const val KEY_Kanji: Int = 65313

    public const val KEY_Kanji_Bangou: Int = 65335

    public const val KEY_Katakana: Int = 65318

    public const val KEY_KbdBrightnessDown: Int = 269025030

    public const val KEY_KbdBrightnessUp: Int = 269025029

    public const val KEY_KbdLightOnOff: Int = 269025028

    public const val KEY_Kcedilla: Int = 979

    public const val KEY_Keyboard: Int = 269025203

    public const val KEY_Korean_Won: Int = 3839

    public const val KEY_L: Int = 76

    public const val KEY_L1: Int = 65480

    public const val KEY_L10: Int = 65489

    public const val KEY_L2: Int = 65481

    public const val KEY_L3: Int = 65482

    public const val KEY_L4: Int = 65483

    public const val KEY_L5: Int = 65484

    public const val KEY_L6: Int = 65485

    public const val KEY_L7: Int = 65486

    public const val KEY_L8: Int = 65487

    public const val KEY_L9: Int = 65488

    public const val KEY_Lacute: Int = 453

    public const val KEY_Last_Virtual_Screen: Int = 65236

    public const val KEY_Launch0: Int = 269025088

    public const val KEY_Launch1: Int = 269025089

    public const val KEY_Launch2: Int = 269025090

    public const val KEY_Launch3: Int = 269025091

    public const val KEY_Launch4: Int = 269025092

    public const val KEY_Launch5: Int = 269025093

    public const val KEY_Launch6: Int = 269025094

    public const val KEY_Launch7: Int = 269025095

    public const val KEY_Launch8: Int = 269025096

    public const val KEY_Launch9: Int = 269025097

    public const val KEY_LaunchA: Int = 269025098

    public const val KEY_LaunchB: Int = 269025099

    public const val KEY_LaunchC: Int = 269025100

    public const val KEY_LaunchD: Int = 269025101

    public const val KEY_LaunchE: Int = 269025102

    public const val KEY_LaunchF: Int = 269025103

    public const val KEY_Lbelowdot: Int = 16784950

    public const val KEY_Lcaron: Int = 421

    public const val KEY_Lcedilla: Int = 934

    public const val KEY_Left: Int = 65361

    public const val KEY_LightBulb: Int = 269025077

    public const val KEY_Linefeed: Int = 65290

    public const val KEY_LiraSign: Int = 16785572

    public const val KEY_LogGrabInfo: Int = 269024805

    public const val KEY_LogOff: Int = 269025121

    public const val KEY_LogWindowTree: Int = 269024804

    public const val KEY_Lstroke: Int = 419

    public const val KEY_M: Int = 77

    public const val KEY_Mabovedot: Int = 16784960

    public const val KEY_Macedonia_DSE: Int = 1717

    public const val KEY_Macedonia_GJE: Int = 1714

    public const val KEY_Macedonia_KJE: Int = 1724

    public const val KEY_Macedonia_dse: Int = 1701

    public const val KEY_Macedonia_gje: Int = 1698

    public const val KEY_Macedonia_kje: Int = 1708

    public const val KEY_Mae_Koho: Int = 65342

    public const val KEY_Mail: Int = 269025049

    public const val KEY_MailForward: Int = 269025168

    public const val KEY_Market: Int = 269025122

    public const val KEY_Massyo: Int = 65324

    public const val KEY_Meeting: Int = 269025123

    public const val KEY_Memo: Int = 269025054

    public const val KEY_Menu: Int = 65383

    public const val KEY_MenuKB: Int = 269025125

    public const val KEY_MenuPB: Int = 269025126

    public const val KEY_Messenger: Int = 269025166

    public const val KEY_Meta_L: Int = 65511

    public const val KEY_Meta_R: Int = 65512

    public const val KEY_MillSign: Int = 16785573

    public const val KEY_ModeLock: Int = 269025025

    public const val KEY_Mode_switch: Int = 65406

    public const val KEY_MonBrightnessDown: Int = 269025027

    public const val KEY_MonBrightnessUp: Int = 269025026

    public const val KEY_MouseKeys_Accel_Enable: Int = 65143

    public const val KEY_MouseKeys_Enable: Int = 65142

    public const val KEY_Muhenkan: Int = 65314

    public const val KEY_Multi_key: Int = 65312

    public const val KEY_MultipleCandidate: Int = 65341

    public const val KEY_Music: Int = 269025170

    public const val KEY_MyComputer: Int = 269025075

    public const val KEY_MySites: Int = 269025127

    public const val KEY_N: Int = 78

    public const val KEY_Nacute: Int = 465

    public const val KEY_NairaSign: Int = 16785574

    public const val KEY_Ncaron: Int = 466

    public const val KEY_Ncedilla: Int = 977

    public const val KEY_New: Int = 269025128

    public const val KEY_NewSheqelSign: Int = 16785578

    public const val KEY_News: Int = 269025129

    public const val KEY_Next: Int = 65366

    public const val KEY_Next_VMode: Int = 269024802

    public const val KEY_Next_Virtual_Screen: Int = 65234

    public const val KEY_Ntilde: Int = 209

    public const val KEY_Num_Lock: Int = 65407

    public const val KEY_O: Int = 79

    public const val KEY_OE: Int = 5052

    public const val KEY_Oacute: Int = 211

    public const val KEY_Obarred: Int = 16777631

    public const val KEY_Obelowdot: Int = 16785100

    public const val KEY_Ocaron: Int = 16777681

    public const val KEY_Ocircumflex: Int = 212

    public const val KEY_Ocircumflexacute: Int = 16785104

    public const val KEY_Ocircumflexbelowdot: Int = 16785112

    public const val KEY_Ocircumflexgrave: Int = 16785106

    public const val KEY_Ocircumflexhook: Int = 16785108

    public const val KEY_Ocircumflextilde: Int = 16785110

    public const val KEY_Odiaeresis: Int = 214

    public const val KEY_Odoubleacute: Int = 469

    public const val KEY_OfficeHome: Int = 269025130

    public const val KEY_Ograve: Int = 210

    public const val KEY_Ohook: Int = 16785102

    public const val KEY_Ohorn: Int = 16777632

    public const val KEY_Ohornacute: Int = 16785114

    public const val KEY_Ohornbelowdot: Int = 16785122

    public const val KEY_Ohorngrave: Int = 16785116

    public const val KEY_Ohornhook: Int = 16785118

    public const val KEY_Ohorntilde: Int = 16785120

    public const val KEY_Omacron: Int = 978

    public const val KEY_Ooblique: Int = 216

    public const val KEY_Open: Int = 269025131

    public const val KEY_OpenURL: Int = 269025080

    public const val KEY_Option: Int = 269025132

    public const val KEY_Oslash: Int = 216

    public const val KEY_Otilde: Int = 213

    public const val KEY_Overlay1_Enable: Int = 65144

    public const val KEY_Overlay2_Enable: Int = 65145

    public const val KEY_P: Int = 80

    public const val KEY_Pabovedot: Int = 16784982

    public const val KEY_Page_Down: Int = 65366

    public const val KEY_Page_Up: Int = 65365

    public const val KEY_Paste: Int = 269025133

    public const val KEY_Pause: Int = 65299

    public const val KEY_PesetaSign: Int = 16785575

    public const val KEY_Phone: Int = 269025134

    public const val KEY_Pictures: Int = 269025169

    public const val KEY_Pointer_Accelerate: Int = 65274

    public const val KEY_Pointer_Button1: Int = 65257

    public const val KEY_Pointer_Button2: Int = 65258

    public const val KEY_Pointer_Button3: Int = 65259

    public const val KEY_Pointer_Button4: Int = 65260

    public const val KEY_Pointer_Button5: Int = 65261

    public const val KEY_Pointer_Button_Dflt: Int = 65256

    public const val KEY_Pointer_DblClick1: Int = 65263

    public const val KEY_Pointer_DblClick2: Int = 65264

    public const val KEY_Pointer_DblClick3: Int = 65265

    public const val KEY_Pointer_DblClick4: Int = 65266

    public const val KEY_Pointer_DblClick5: Int = 65267

    public const val KEY_Pointer_DblClick_Dflt: Int = 65262

    public const val KEY_Pointer_DfltBtnNext: Int = 65275

    public const val KEY_Pointer_DfltBtnPrev: Int = 65276

    public const val KEY_Pointer_Down: Int = 65251

    public const val KEY_Pointer_DownLeft: Int = 65254

    public const val KEY_Pointer_DownRight: Int = 65255

    public const val KEY_Pointer_Drag1: Int = 65269

    public const val KEY_Pointer_Drag2: Int = 65270

    public const val KEY_Pointer_Drag3: Int = 65271

    public const val KEY_Pointer_Drag4: Int = 65272

    public const val KEY_Pointer_Drag5: Int = 65277

    public const val KEY_Pointer_Drag_Dflt: Int = 65268

    public const val KEY_Pointer_EnableKeys: Int = 65273

    public const val KEY_Pointer_Left: Int = 65248

    public const val KEY_Pointer_Right: Int = 65249

    public const val KEY_Pointer_Up: Int = 65250

    public const val KEY_Pointer_UpLeft: Int = 65252

    public const val KEY_Pointer_UpRight: Int = 65253

    public const val KEY_PowerDown: Int = 269025057

    public const val KEY_PowerOff: Int = 269025066

    public const val KEY_Prev_VMode: Int = 269024803

    public const val KEY_Prev_Virtual_Screen: Int = 65233

    public const val KEY_PreviousCandidate: Int = 65342

    public const val KEY_Print: Int = 65377

    public const val KEY_Prior: Int = 65365

    public const val KEY_Q: Int = 81

    public const val KEY_R: Int = 82

    public const val KEY_R1: Int = 65490

    public const val KEY_R10: Int = 65499

    public const val KEY_R11: Int = 65500

    public const val KEY_R12: Int = 65501

    public const val KEY_R13: Int = 65502

    public const val KEY_R14: Int = 65503

    public const val KEY_R15: Int = 65504

    public const val KEY_R2: Int = 65491

    public const val KEY_R3: Int = 65492

    public const val KEY_R4: Int = 65493

    public const val KEY_R5: Int = 65494

    public const val KEY_R6: Int = 65495

    public const val KEY_R7: Int = 65496

    public const val KEY_R8: Int = 65497

    public const val KEY_R9: Int = 65498

    public const val KEY_RFKill: Int = 269025205

    public const val KEY_Racute: Int = 448

    public const val KEY_Rcaron: Int = 472

    public const val KEY_Rcedilla: Int = 931

    public const val KEY_Red: Int = 269025187

    public const val KEY_Redo: Int = 65382

    public const val KEY_Refresh: Int = 269025065

    public const val KEY_Reload: Int = 269025139

    public const val KEY_RepeatKeys_Enable: Int = 65138

    public const val KEY_Reply: Int = 269025138

    public const val KEY_Return: Int = 65293

    public const val KEY_Right: Int = 65363

    public const val KEY_RockerDown: Int = 269025060

    public const val KEY_RockerEnter: Int = 269025061

    public const val KEY_RockerUp: Int = 269025059

    public const val KEY_Romaji: Int = 65316

    public const val KEY_RotateWindows: Int = 269025140

    public const val KEY_RotationKB: Int = 269025142

    public const val KEY_RotationPB: Int = 269025141

    public const val KEY_RupeeSign: Int = 16785576

    public const val KEY_S: Int = 83

    public const val KEY_SCHWA: Int = 16777615

    public const val KEY_Sabovedot: Int = 16784992

    public const val KEY_Sacute: Int = 422

    public const val KEY_Save: Int = 269025143

    public const val KEY_Scaron: Int = 425

    public const val KEY_Scedilla: Int = 426

    public const val KEY_Scircumflex: Int = 734

    public const val KEY_ScreenSaver: Int = 269025069

    public const val KEY_ScrollClick: Int = 269025146

    public const val KEY_ScrollDown: Int = 269025145

    public const val KEY_ScrollUp: Int = 269025144

    public const val KEY_Scroll_Lock: Int = 65300

    public const val KEY_Search: Int = 269025051

    public const val KEY_Select: Int = 65376

    public const val KEY_SelectButton: Int = 269025184

    public const val KEY_Send: Int = 269025147

    public const val KEY_Serbian_DJE: Int = 1713

    public const val KEY_Serbian_DZE: Int = 1727

    public const val KEY_Serbian_JE: Int = 1720

    public const val KEY_Serbian_LJE: Int = 1721

    public const val KEY_Serbian_NJE: Int = 1722

    public const val KEY_Serbian_TSHE: Int = 1723

    public const val KEY_Serbian_dje: Int = 1697

    public const val KEY_Serbian_dze: Int = 1711

    public const val KEY_Serbian_je: Int = 1704

    public const val KEY_Serbian_lje: Int = 1705

    public const val KEY_Serbian_nje: Int = 1706

    public const val KEY_Serbian_tshe: Int = 1707

    public const val KEY_Shift_L: Int = 65505

    public const val KEY_Shift_Lock: Int = 65510

    public const val KEY_Shift_R: Int = 65506

    public const val KEY_Shop: Int = 269025078

    public const val KEY_SingleCandidate: Int = 65340

    public const val KEY_Sinh_a: Int = 16780677

    public const val KEY_Sinh_aa: Int = 16780678

    public const val KEY_Sinh_aa2: Int = 16780751

    public const val KEY_Sinh_ae: Int = 16780679

    public const val KEY_Sinh_ae2: Int = 16780752

    public const val KEY_Sinh_aee: Int = 16780680

    public const val KEY_Sinh_aee2: Int = 16780753

    public const val KEY_Sinh_ai: Int = 16780691

    public const val KEY_Sinh_ai2: Int = 16780763

    public const val KEY_Sinh_al: Int = 16780746

    public const val KEY_Sinh_au: Int = 16780694

    public const val KEY_Sinh_au2: Int = 16780766

    public const val KEY_Sinh_ba: Int = 16780726

    public const val KEY_Sinh_bha: Int = 16780727

    public const val KEY_Sinh_ca: Int = 16780704

    public const val KEY_Sinh_cha: Int = 16780705

    public const val KEY_Sinh_dda: Int = 16780713

    public const val KEY_Sinh_ddha: Int = 16780714

    public const val KEY_Sinh_dha: Int = 16780719

    public const val KEY_Sinh_dhha: Int = 16780720

    public const val KEY_Sinh_e: Int = 16780689

    public const val KEY_Sinh_e2: Int = 16780761

    public const val KEY_Sinh_ee: Int = 16780690

    public const val KEY_Sinh_ee2: Int = 16780762

    public const val KEY_Sinh_fa: Int = 16780742

    public const val KEY_Sinh_ga: Int = 16780700

    public const val KEY_Sinh_gha: Int = 16780701

    public const val KEY_Sinh_h2: Int = 16780675

    public const val KEY_Sinh_ha: Int = 16780740

    public const val KEY_Sinh_i: Int = 16780681

    public const val KEY_Sinh_i2: Int = 16780754

    public const val KEY_Sinh_ii: Int = 16780682

    public const val KEY_Sinh_ii2: Int = 16780755

    public const val KEY_Sinh_ja: Int = 16780706

    public const val KEY_Sinh_jha: Int = 16780707

    public const val KEY_Sinh_jnya: Int = 16780709

    public const val KEY_Sinh_ka: Int = 16780698

    public const val KEY_Sinh_kha: Int = 16780699

    public const val KEY_Sinh_kunddaliya: Int = 16780788

    public const val KEY_Sinh_la: Int = 16780733

    public const val KEY_Sinh_lla: Int = 16780741

    public const val KEY_Sinh_lu: Int = 16780687

    public const val KEY_Sinh_lu2: Int = 16780767

    public const val KEY_Sinh_luu: Int = 16780688

    public const val KEY_Sinh_luu2: Int = 16780787

    public const val KEY_Sinh_ma: Int = 16780728

    public const val KEY_Sinh_mba: Int = 16780729

    public const val KEY_Sinh_na: Int = 16780721

    public const val KEY_Sinh_ndda: Int = 16780716

    public const val KEY_Sinh_ndha: Int = 16780723

    public const val KEY_Sinh_ng: Int = 16780674

    public const val KEY_Sinh_ng2: Int = 16780702

    public const val KEY_Sinh_nga: Int = 16780703

    public const val KEY_Sinh_nja: Int = 16780710

    public const val KEY_Sinh_nna: Int = 16780715

    public const val KEY_Sinh_nya: Int = 16780708

    public const val KEY_Sinh_o: Int = 16780692

    public const val KEY_Sinh_o2: Int = 16780764

    public const val KEY_Sinh_oo: Int = 16780693

    public const val KEY_Sinh_oo2: Int = 16780765

    public const val KEY_Sinh_pa: Int = 16780724

    public const val KEY_Sinh_pha: Int = 16780725

    public const val KEY_Sinh_ra: Int = 16780731

    public const val KEY_Sinh_ri: Int = 16780685

    public const val KEY_Sinh_rii: Int = 16780686

    public const val KEY_Sinh_ru2: Int = 16780760

    public const val KEY_Sinh_ruu2: Int = 16780786

    public const val KEY_Sinh_sa: Int = 16780739

    public const val KEY_Sinh_sha: Int = 16780737

    public const val KEY_Sinh_ssha: Int = 16780738

    public const val KEY_Sinh_tha: Int = 16780717

    public const val KEY_Sinh_thha: Int = 16780718

    public const val KEY_Sinh_tta: Int = 16780711

    public const val KEY_Sinh_ttha: Int = 16780712

    public const val KEY_Sinh_u: Int = 16780683

    public const val KEY_Sinh_u2: Int = 16780756

    public const val KEY_Sinh_uu: Int = 16780684

    public const val KEY_Sinh_uu2: Int = 16780758

    public const val KEY_Sinh_va: Int = 16780736

    public const val KEY_Sinh_ya: Int = 16780730

    public const val KEY_Sleep: Int = 269025071

    public const val KEY_SlowKeys_Enable: Int = 65139

    public const val KEY_Spell: Int = 269025148

    public const val KEY_SplitScreen: Int = 269025149

    public const val KEY_Standby: Int = 269025040

    public const val KEY_Start: Int = 269025050

    public const val KEY_StickyKeys_Enable: Int = 65141

    public const val KEY_Stop: Int = 269025064

    public const val KEY_Subtitle: Int = 269025178

    public const val KEY_Super_L: Int = 65515

    public const val KEY_Super_R: Int = 65516

    public const val KEY_Support: Int = 269025150

    public const val KEY_Suspend: Int = 269025191

    public const val KEY_Switch_VT_1: Int = 269024769

    public const val KEY_Switch_VT_10: Int = 269024778

    public const val KEY_Switch_VT_11: Int = 269024779

    public const val KEY_Switch_VT_12: Int = 269024780

    public const val KEY_Switch_VT_2: Int = 269024770

    public const val KEY_Switch_VT_3: Int = 269024771

    public const val KEY_Switch_VT_4: Int = 269024772

    public const val KEY_Switch_VT_5: Int = 269024773

    public const val KEY_Switch_VT_6: Int = 269024774

    public const val KEY_Switch_VT_7: Int = 269024775

    public const val KEY_Switch_VT_8: Int = 269024776

    public const val KEY_Switch_VT_9: Int = 269024777

    public const val KEY_Sys_Req: Int = 65301

    public const val KEY_T: Int = 84

    public const val KEY_THORN: Int = 222

    public const val KEY_Tab: Int = 65289

    public const val KEY_Tabovedot: Int = 16785002

    public const val KEY_TaskPane: Int = 269025151

    public const val KEY_Tcaron: Int = 427

    public const val KEY_Tcedilla: Int = 478

    public const val KEY_Terminal: Int = 269025152

    public const val KEY_Terminate_Server: Int = 65237

    public const val KEY_Thai_baht: Int = 3551

    public const val KEY_Thai_bobaimai: Int = 3514

    public const val KEY_Thai_chochan: Int = 3496

    public const val KEY_Thai_chochang: Int = 3498

    public const val KEY_Thai_choching: Int = 3497

    public const val KEY_Thai_chochoe: Int = 3500

    public const val KEY_Thai_dochada: Int = 3502

    public const val KEY_Thai_dodek: Int = 3508

    public const val KEY_Thai_fofa: Int = 3517

    public const val KEY_Thai_fofan: Int = 3519

    public const val KEY_Thai_hohip: Int = 3531

    public const val KEY_Thai_honokhuk: Int = 3534

    public const val KEY_Thai_khokhai: Int = 3490

    public const val KEY_Thai_khokhon: Int = 3493

    public const val KEY_Thai_khokhuat: Int = 3491

    public const val KEY_Thai_khokhwai: Int = 3492

    public const val KEY_Thai_khorakhang: Int = 3494

    public const val KEY_Thai_kokai: Int = 3489

    public const val KEY_Thai_lakkhangyao: Int = 3557

    public const val KEY_Thai_lekchet: Int = 3575

    public const val KEY_Thai_lekha: Int = 3573

    public const val KEY_Thai_lekhok: Int = 3574

    public const val KEY_Thai_lekkao: Int = 3577

    public const val KEY_Thai_leknung: Int = 3569

    public const val KEY_Thai_lekpaet: Int = 3576

    public const val KEY_Thai_leksam: Int = 3571

    public const val KEY_Thai_leksi: Int = 3572

    public const val KEY_Thai_leksong: Int = 3570

    public const val KEY_Thai_leksun: Int = 3568

    public const val KEY_Thai_lochula: Int = 3532

    public const val KEY_Thai_loling: Int = 3525

    public const val KEY_Thai_lu: Int = 3526

    public const val KEY_Thai_maichattawa: Int = 3563

    public const val KEY_Thai_maiek: Int = 3560

    public const val KEY_Thai_maihanakat: Int = 3537

    public const val KEY_Thai_maihanakat_maitho: Int = 3550

    public const val KEY_Thai_maitaikhu: Int = 3559

    public const val KEY_Thai_maitho: Int = 3561

    public const val KEY_Thai_maitri: Int = 3562

    public const val KEY_Thai_maiyamok: Int = 3558

    public const val KEY_Thai_moma: Int = 3521

    public const val KEY_Thai_ngongu: Int = 3495

    public const val KEY_Thai_nikhahit: Int = 3565

    public const val KEY_Thai_nonen: Int = 3507

    public const val KEY_Thai_nonu: Int = 3513

    public const val KEY_Thai_oang: Int = 3533

    public const val KEY_Thai_paiyannoi: Int = 3535

    public const val KEY_Thai_phinthu: Int = 3546

    public const val KEY_Thai_phophan: Int = 3518

    public const val KEY_Thai_phophung: Int = 3516

    public const val KEY_Thai_phosamphao: Int = 3520

    public const val KEY_Thai_popla: Int = 3515

    public const val KEY_Thai_rorua: Int = 3523

    public const val KEY_Thai_ru: Int = 3524

    public const val KEY_Thai_saraa: Int = 3536

    public const val KEY_Thai_saraaa: Int = 3538

    public const val KEY_Thai_saraae: Int = 3553

    public const val KEY_Thai_saraaimaimalai: Int = 3556

    public const val KEY_Thai_saraaimaimuan: Int = 3555

    public const val KEY_Thai_saraam: Int = 3539

    public const val KEY_Thai_sarae: Int = 3552

    public const val KEY_Thai_sarai: Int = 3540

    public const val KEY_Thai_saraii: Int = 3541

    public const val KEY_Thai_sarao: Int = 3554

    public const val KEY_Thai_sarau: Int = 3544

    public const val KEY_Thai_saraue: Int = 3542

    public const val KEY_Thai_sarauee: Int = 3543

    public const val KEY_Thai_sarauu: Int = 3545

    public const val KEY_Thai_sorusi: Int = 3529

    public const val KEY_Thai_sosala: Int = 3528

    public const val KEY_Thai_soso: Int = 3499

    public const val KEY_Thai_sosua: Int = 3530

    public const val KEY_Thai_thanthakhat: Int = 3564

    public const val KEY_Thai_thonangmontho: Int = 3505

    public const val KEY_Thai_thophuthao: Int = 3506

    public const val KEY_Thai_thothahan: Int = 3511

    public const val KEY_Thai_thothan: Int = 3504

    public const val KEY_Thai_thothong: Int = 3512

    public const val KEY_Thai_thothung: Int = 3510

    public const val KEY_Thai_topatak: Int = 3503

    public const val KEY_Thai_totao: Int = 3509

    public const val KEY_Thai_wowaen: Int = 3527

    public const val KEY_Thai_yoyak: Int = 3522

    public const val KEY_Thai_yoying: Int = 3501

    public const val KEY_Thorn: Int = 222

    public const val KEY_Time: Int = 269025183

    public const val KEY_ToDoList: Int = 269025055

    public const val KEY_Tools: Int = 269025153

    public const val KEY_TopMenu: Int = 269025186

    public const val KEY_TouchpadOff: Int = 269025201

    public const val KEY_TouchpadOn: Int = 269025200

    public const val KEY_TouchpadToggle: Int = 269025193

    public const val KEY_Touroku: Int = 65323

    public const val KEY_Travel: Int = 269025154

    public const val KEY_Tslash: Int = 940

    public const val KEY_U: Int = 85

    public const val KEY_UWB: Int = 269025174

    public const val KEY_Uacute: Int = 218

    public const val KEY_Ubelowdot: Int = 16785124

    public const val KEY_Ubreve: Int = 733

    public const val KEY_Ucircumflex: Int = 219

    public const val KEY_Udiaeresis: Int = 220

    public const val KEY_Udoubleacute: Int = 475

    public const val KEY_Ugrave: Int = 217

    public const val KEY_Uhook: Int = 16785126

    public const val KEY_Uhorn: Int = 16777647

    public const val KEY_Uhornacute: Int = 16785128

    public const val KEY_Uhornbelowdot: Int = 16785136

    public const val KEY_Uhorngrave: Int = 16785130

    public const val KEY_Uhornhook: Int = 16785132

    public const val KEY_Uhorntilde: Int = 16785134

    public const val KEY_Ukrainian_GHE_WITH_UPTURN: Int = 1725

    public const val KEY_Ukrainian_I: Int = 1718

    public const val KEY_Ukrainian_IE: Int = 1716

    public const val KEY_Ukrainian_YI: Int = 1719

    public const val KEY_Ukrainian_ghe_with_upturn: Int = 1709

    public const val KEY_Ukrainian_i: Int = 1702

    public const val KEY_Ukrainian_ie: Int = 1700

    public const val KEY_Ukrainian_yi: Int = 1703

    public const val KEY_Ukranian_I: Int = 1718

    public const val KEY_Ukranian_JE: Int = 1716

    public const val KEY_Ukranian_YI: Int = 1719

    public const val KEY_Ukranian_i: Int = 1702

    public const val KEY_Ukranian_je: Int = 1700

    public const val KEY_Ukranian_yi: Int = 1703

    public const val KEY_Umacron: Int = 990

    public const val KEY_Undo: Int = 65381

    public const val KEY_Ungrab: Int = 269024800

    public const val KEY_Uogonek: Int = 985

    public const val KEY_Up: Int = 65362

    public const val KEY_Uring: Int = 473

    public const val KEY_User1KB: Int = 269025157

    public const val KEY_User2KB: Int = 269025158

    public const val KEY_UserPB: Int = 269025156

    public const val KEY_Utilde: Int = 989

    public const val KEY_V: Int = 86

    public const val KEY_VendorHome: Int = 269025076

    public const val KEY_Video: Int = 269025159

    public const val KEY_View: Int = 269025185

    public const val KEY_VoidSymbol: Int = 16777215

    public const val KEY_W: Int = 87

    public const val KEY_WLAN: Int = 269025173

    public const val KEY_WWAN: Int = 269025204

    public const val KEY_WWW: Int = 269025070

    public const val KEY_Wacute: Int = 16785026

    public const val KEY_WakeUp: Int = 269025067

    public const val KEY_Wcircumflex: Int = 16777588

    public const val KEY_Wdiaeresis: Int = 16785028

    public const val KEY_WebCam: Int = 269025167

    public const val KEY_Wgrave: Int = 16785024

    public const val KEY_WheelButton: Int = 269025160

    public const val KEY_WindowClear: Int = 269025109

    public const val KEY_WonSign: Int = 16785577

    public const val KEY_Word: Int = 269025161

    public const val KEY_X: Int = 88

    public const val KEY_Xabovedot: Int = 16785034

    public const val KEY_Xfer: Int = 269025162

    public const val KEY_Y: Int = 89

    public const val KEY_Yacute: Int = 221

    public const val KEY_Ybelowdot: Int = 16785140

    public const val KEY_Ycircumflex: Int = 16777590

    public const val KEY_Ydiaeresis: Int = 5054

    public const val KEY_Yellow: Int = 269025189

    public const val KEY_Ygrave: Int = 16785138

    public const val KEY_Yhook: Int = 16785142

    public const val KEY_Ytilde: Int = 16785144

    public const val KEY_Z: Int = 90

    public const val KEY_Zabovedot: Int = 431

    public const val KEY_Zacute: Int = 428

    public const val KEY_Zcaron: Int = 430

    public const val KEY_Zen_Koho: Int = 65341

    public const val KEY_Zenkaku: Int = 65320

    public const val KEY_Zenkaku_Hankaku: Int = 65322

    public const val KEY_ZoomIn: Int = 269025163

    public const val KEY_ZoomOut: Int = 269025164

    public const val KEY_Zstroke: Int = 16777653

    public const val KEY_a: Int = 97

    public const val KEY_aacute: Int = 225

    public const val KEY_abelowdot: Int = 16785057

    public const val KEY_abovedot: Int = 511

    public const val KEY_abreve: Int = 483

    public const val KEY_abreveacute: Int = 16785071

    public const val KEY_abrevebelowdot: Int = 16785079

    public const val KEY_abrevegrave: Int = 16785073

    public const val KEY_abrevehook: Int = 16785075

    public const val KEY_abrevetilde: Int = 16785077

    public const val KEY_acircumflex: Int = 226

    public const val KEY_acircumflexacute: Int = 16785061

    public const val KEY_acircumflexbelowdot: Int = 16785069

    public const val KEY_acircumflexgrave: Int = 16785063

    public const val KEY_acircumflexhook: Int = 16785065

    public const val KEY_acircumflextilde: Int = 16785067

    public const val KEY_acute: Int = 180

    public const val KEY_adiaeresis: Int = 228

    public const val KEY_ae: Int = 230

    public const val KEY_agrave: Int = 224

    public const val KEY_ahook: Int = 16785059

    public const val KEY_amacron: Int = 992

    public const val KEY_ampersand: Int = 38

    public const val KEY_aogonek: Int = 433

    public const val KEY_apostrophe: Int = 39

    public const val KEY_approxeq: Int = 16785992

    public const val KEY_approximate: Int = 2248

    public const val KEY_aring: Int = 229

    public const val KEY_asciicircum: Int = 94

    public const val KEY_asciitilde: Int = 126

    public const val KEY_asterisk: Int = 42

    public const val KEY_at: Int = 64

    public const val KEY_atilde: Int = 227

    public const val KEY_b: Int = 98

    public const val KEY_babovedot: Int = 16784899

    public const val KEY_backslash: Int = 92

    public const val KEY_ballotcross: Int = 2804

    public const val KEY_bar: Int = 124

    public const val KEY_because: Int = 16785973

    public const val KEY_blank: Int = 2527

    public const val KEY_botintegral: Int = 2213

    public const val KEY_botleftparens: Int = 2220

    public const val KEY_botleftsqbracket: Int = 2216

    public const val KEY_botleftsummation: Int = 2226

    public const val KEY_botrightparens: Int = 2222

    public const val KEY_botrightsqbracket: Int = 2218

    public const val KEY_botrightsummation: Int = 2230

    public const val KEY_bott: Int = 2550

    public const val KEY_botvertsummationconnector: Int = 2228

    public const val KEY_braceleft: Int = 123

    public const val KEY_braceright: Int = 125

    public const val KEY_bracketleft: Int = 91

    public const val KEY_bracketright: Int = 93

    public const val KEY_braille_blank: Int = 16787456

    public const val KEY_braille_dot_1: Int = 65521

    public const val KEY_braille_dot_10: Int = 65530

    public const val KEY_braille_dot_2: Int = 65522

    public const val KEY_braille_dot_3: Int = 65523

    public const val KEY_braille_dot_4: Int = 65524

    public const val KEY_braille_dot_5: Int = 65525

    public const val KEY_braille_dot_6: Int = 65526

    public const val KEY_braille_dot_7: Int = 65527

    public const val KEY_braille_dot_8: Int = 65528

    public const val KEY_braille_dot_9: Int = 65529

    public const val KEY_braille_dots_1: Int = 16787457

    public const val KEY_braille_dots_12: Int = 16787459

    public const val KEY_braille_dots_123: Int = 16787463

    public const val KEY_braille_dots_1234: Int = 16787471

    public const val KEY_braille_dots_12345: Int = 16787487

    public const val KEY_braille_dots_123456: Int = 16787519

    public const val KEY_braille_dots_1234567: Int = 16787583

    public const val KEY_braille_dots_12345678: Int = 16787711

    public const val KEY_braille_dots_1234568: Int = 16787647

    public const val KEY_braille_dots_123457: Int = 16787551

    public const val KEY_braille_dots_1234578: Int = 16787679

    public const val KEY_braille_dots_123458: Int = 16787615

    public const val KEY_braille_dots_12346: Int = 16787503

    public const val KEY_braille_dots_123467: Int = 16787567

    public const val KEY_braille_dots_1234678: Int = 16787695

    public const val KEY_braille_dots_123468: Int = 16787631

    public const val KEY_braille_dots_12347: Int = 16787535

    public const val KEY_braille_dots_123478: Int = 16787663

    public const val KEY_braille_dots_12348: Int = 16787599

    public const val KEY_braille_dots_1235: Int = 16787479

    public const val KEY_braille_dots_12356: Int = 16787511

    public const val KEY_braille_dots_123567: Int = 16787575

    public const val KEY_braille_dots_1235678: Int = 16787703

    public const val KEY_braille_dots_123568: Int = 16787639

    public const val KEY_braille_dots_12357: Int = 16787543

    public const val KEY_braille_dots_123578: Int = 16787671

    public const val KEY_braille_dots_12358: Int = 16787607

    public const val KEY_braille_dots_1236: Int = 16787495

    public const val KEY_braille_dots_12367: Int = 16787559

    public const val KEY_braille_dots_123678: Int = 16787687

    public const val KEY_braille_dots_12368: Int = 16787623

    public const val KEY_braille_dots_1237: Int = 16787527

    public const val KEY_braille_dots_12378: Int = 16787655

    public const val KEY_braille_dots_1238: Int = 16787591

    public const val KEY_braille_dots_124: Int = 16787467

    public const val KEY_braille_dots_1245: Int = 16787483

    public const val KEY_braille_dots_12456: Int = 16787515

    public const val KEY_braille_dots_124567: Int = 16787579

    public const val KEY_braille_dots_1245678: Int = 16787707

    public const val KEY_braille_dots_124568: Int = 16787643

    public const val KEY_braille_dots_12457: Int = 16787547

    public const val KEY_braille_dots_124578: Int = 16787675

    public const val KEY_braille_dots_12458: Int = 16787611

    public const val KEY_braille_dots_1246: Int = 16787499

    public const val KEY_braille_dots_12467: Int = 16787563

    public const val KEY_braille_dots_124678: Int = 16787691

    public const val KEY_braille_dots_12468: Int = 16787627

    public const val KEY_braille_dots_1247: Int = 16787531

    public const val KEY_braille_dots_12478: Int = 16787659

    public const val KEY_braille_dots_1248: Int = 16787595

    public const val KEY_braille_dots_125: Int = 16787475

    public const val KEY_braille_dots_1256: Int = 16787507

    public const val KEY_braille_dots_12567: Int = 16787571

    public const val KEY_braille_dots_125678: Int = 16787699

    public const val KEY_braille_dots_12568: Int = 16787635

    public const val KEY_braille_dots_1257: Int = 16787539

    public const val KEY_braille_dots_12578: Int = 16787667

    public const val KEY_braille_dots_1258: Int = 16787603

    public const val KEY_braille_dots_126: Int = 16787491

    public const val KEY_braille_dots_1267: Int = 16787555

    public const val KEY_braille_dots_12678: Int = 16787683

    public const val KEY_braille_dots_1268: Int = 16787619

    public const val KEY_braille_dots_127: Int = 16787523

    public const val KEY_braille_dots_1278: Int = 16787651

    public const val KEY_braille_dots_128: Int = 16787587

    public const val KEY_braille_dots_13: Int = 16787461

    public const val KEY_braille_dots_134: Int = 16787469

    public const val KEY_braille_dots_1345: Int = 16787485

    public const val KEY_braille_dots_13456: Int = 16787517

    public const val KEY_braille_dots_134567: Int = 16787581

    public const val KEY_braille_dots_1345678: Int = 16787709

    public const val KEY_braille_dots_134568: Int = 16787645

    public const val KEY_braille_dots_13457: Int = 16787549

    public const val KEY_braille_dots_134578: Int = 16787677

    public const val KEY_braille_dots_13458: Int = 16787613

    public const val KEY_braille_dots_1346: Int = 16787501

    public const val KEY_braille_dots_13467: Int = 16787565

    public const val KEY_braille_dots_134678: Int = 16787693

    public const val KEY_braille_dots_13468: Int = 16787629

    public const val KEY_braille_dots_1347: Int = 16787533

    public const val KEY_braille_dots_13478: Int = 16787661

    public const val KEY_braille_dots_1348: Int = 16787597

    public const val KEY_braille_dots_135: Int = 16787477

    public const val KEY_braille_dots_1356: Int = 16787509

    public const val KEY_braille_dots_13567: Int = 16787573

    public const val KEY_braille_dots_135678: Int = 16787701

    public const val KEY_braille_dots_13568: Int = 16787637

    public const val KEY_braille_dots_1357: Int = 16787541

    public const val KEY_braille_dots_13578: Int = 16787669

    public const val KEY_braille_dots_1358: Int = 16787605

    public const val KEY_braille_dots_136: Int = 16787493

    public const val KEY_braille_dots_1367: Int = 16787557

    public const val KEY_braille_dots_13678: Int = 16787685

    public const val KEY_braille_dots_1368: Int = 16787621

    public const val KEY_braille_dots_137: Int = 16787525

    public const val KEY_braille_dots_1378: Int = 16787653

    public const val KEY_braille_dots_138: Int = 16787589

    public const val KEY_braille_dots_14: Int = 16787465

    public const val KEY_braille_dots_145: Int = 16787481

    public const val KEY_braille_dots_1456: Int = 16787513

    public const val KEY_braille_dots_14567: Int = 16787577

    public const val KEY_braille_dots_145678: Int = 16787705

    public const val KEY_braille_dots_14568: Int = 16787641

    public const val KEY_braille_dots_1457: Int = 16787545

    public const val KEY_braille_dots_14578: Int = 16787673

    public const val KEY_braille_dots_1458: Int = 16787609

    public const val KEY_braille_dots_146: Int = 16787497

    public const val KEY_braille_dots_1467: Int = 16787561

    public const val KEY_braille_dots_14678: Int = 16787689

    public const val KEY_braille_dots_1468: Int = 16787625

    public const val KEY_braille_dots_147: Int = 16787529

    public const val KEY_braille_dots_1478: Int = 16787657

    public const val KEY_braille_dots_148: Int = 16787593

    public const val KEY_braille_dots_15: Int = 16787473

    public const val KEY_braille_dots_156: Int = 16787505

    public const val KEY_braille_dots_1567: Int = 16787569

    public const val KEY_braille_dots_15678: Int = 16787697

    public const val KEY_braille_dots_1568: Int = 16787633

    public const val KEY_braille_dots_157: Int = 16787537

    public const val KEY_braille_dots_1578: Int = 16787665

    public const val KEY_braille_dots_158: Int = 16787601

    public const val KEY_braille_dots_16: Int = 16787489

    public const val KEY_braille_dots_167: Int = 16787553

    public const val KEY_braille_dots_1678: Int = 16787681

    public const val KEY_braille_dots_168: Int = 16787617

    public const val KEY_braille_dots_17: Int = 16787521

    public const val KEY_braille_dots_178: Int = 16787649

    public const val KEY_braille_dots_18: Int = 16787585

    public const val KEY_braille_dots_2: Int = 16787458

    public const val KEY_braille_dots_23: Int = 16787462

    public const val KEY_braille_dots_234: Int = 16787470

    public const val KEY_braille_dots_2345: Int = 16787486

    public const val KEY_braille_dots_23456: Int = 16787518

    public const val KEY_braille_dots_234567: Int = 16787582

    public const val KEY_braille_dots_2345678: Int = 16787710

    public const val KEY_braille_dots_234568: Int = 16787646

    public const val KEY_braille_dots_23457: Int = 16787550

    public const val KEY_braille_dots_234578: Int = 16787678

    public const val KEY_braille_dots_23458: Int = 16787614

    public const val KEY_braille_dots_2346: Int = 16787502

    public const val KEY_braille_dots_23467: Int = 16787566

    public const val KEY_braille_dots_234678: Int = 16787694

    public const val KEY_braille_dots_23468: Int = 16787630

    public const val KEY_braille_dots_2347: Int = 16787534

    public const val KEY_braille_dots_23478: Int = 16787662

    public const val KEY_braille_dots_2348: Int = 16787598

    public const val KEY_braille_dots_235: Int = 16787478

    public const val KEY_braille_dots_2356: Int = 16787510

    public const val KEY_braille_dots_23567: Int = 16787574

    public const val KEY_braille_dots_235678: Int = 16787702

    public const val KEY_braille_dots_23568: Int = 16787638

    public const val KEY_braille_dots_2357: Int = 16787542

    public const val KEY_braille_dots_23578: Int = 16787670

    public const val KEY_braille_dots_2358: Int = 16787606

    public const val KEY_braille_dots_236: Int = 16787494

    public const val KEY_braille_dots_2367: Int = 16787558

    public const val KEY_braille_dots_23678: Int = 16787686

    public const val KEY_braille_dots_2368: Int = 16787622

    public const val KEY_braille_dots_237: Int = 16787526

    public const val KEY_braille_dots_2378: Int = 16787654

    public const val KEY_braille_dots_238: Int = 16787590

    public const val KEY_braille_dots_24: Int = 16787466

    public const val KEY_braille_dots_245: Int = 16787482

    public const val KEY_braille_dots_2456: Int = 16787514

    public const val KEY_braille_dots_24567: Int = 16787578

    public const val KEY_braille_dots_245678: Int = 16787706

    public const val KEY_braille_dots_24568: Int = 16787642

    public const val KEY_braille_dots_2457: Int = 16787546

    public const val KEY_braille_dots_24578: Int = 16787674

    public const val KEY_braille_dots_2458: Int = 16787610

    public const val KEY_braille_dots_246: Int = 16787498

    public const val KEY_braille_dots_2467: Int = 16787562

    public const val KEY_braille_dots_24678: Int = 16787690

    public const val KEY_braille_dots_2468: Int = 16787626

    public const val KEY_braille_dots_247: Int = 16787530

    public const val KEY_braille_dots_2478: Int = 16787658

    public const val KEY_braille_dots_248: Int = 16787594

    public const val KEY_braille_dots_25: Int = 16787474

    public const val KEY_braille_dots_256: Int = 16787506

    public const val KEY_braille_dots_2567: Int = 16787570

    public const val KEY_braille_dots_25678: Int = 16787698

    public const val KEY_braille_dots_2568: Int = 16787634

    public const val KEY_braille_dots_257: Int = 16787538

    public const val KEY_braille_dots_2578: Int = 16787666

    public const val KEY_braille_dots_258: Int = 16787602

    public const val KEY_braille_dots_26: Int = 16787490

    public const val KEY_braille_dots_267: Int = 16787554

    public const val KEY_braille_dots_2678: Int = 16787682

    public const val KEY_braille_dots_268: Int = 16787618

    public const val KEY_braille_dots_27: Int = 16787522

    public const val KEY_braille_dots_278: Int = 16787650

    public const val KEY_braille_dots_28: Int = 16787586

    public const val KEY_braille_dots_3: Int = 16787460

    public const val KEY_braille_dots_34: Int = 16787468

    public const val KEY_braille_dots_345: Int = 16787484

    public const val KEY_braille_dots_3456: Int = 16787516

    public const val KEY_braille_dots_34567: Int = 16787580

    public const val KEY_braille_dots_345678: Int = 16787708

    public const val KEY_braille_dots_34568: Int = 16787644

    public const val KEY_braille_dots_3457: Int = 16787548

    public const val KEY_braille_dots_34578: Int = 16787676

    public const val KEY_braille_dots_3458: Int = 16787612

    public const val KEY_braille_dots_346: Int = 16787500

    public const val KEY_braille_dots_3467: Int = 16787564

    public const val KEY_braille_dots_34678: Int = 16787692

    public const val KEY_braille_dots_3468: Int = 16787628

    public const val KEY_braille_dots_347: Int = 16787532

    public const val KEY_braille_dots_3478: Int = 16787660

    public const val KEY_braille_dots_348: Int = 16787596

    public const val KEY_braille_dots_35: Int = 16787476

    public const val KEY_braille_dots_356: Int = 16787508

    public const val KEY_braille_dots_3567: Int = 16787572

    public const val KEY_braille_dots_35678: Int = 16787700

    public const val KEY_braille_dots_3568: Int = 16787636

    public const val KEY_braille_dots_357: Int = 16787540

    public const val KEY_braille_dots_3578: Int = 16787668

    public const val KEY_braille_dots_358: Int = 16787604

    public const val KEY_braille_dots_36: Int = 16787492

    public const val KEY_braille_dots_367: Int = 16787556

    public const val KEY_braille_dots_3678: Int = 16787684

    public const val KEY_braille_dots_368: Int = 16787620

    public const val KEY_braille_dots_37: Int = 16787524

    public const val KEY_braille_dots_378: Int = 16787652

    public const val KEY_braille_dots_38: Int = 16787588

    public const val KEY_braille_dots_4: Int = 16787464

    public const val KEY_braille_dots_45: Int = 16787480

    public const val KEY_braille_dots_456: Int = 16787512

    public const val KEY_braille_dots_4567: Int = 16787576

    public const val KEY_braille_dots_45678: Int = 16787704

    public const val KEY_braille_dots_4568: Int = 16787640

    public const val KEY_braille_dots_457: Int = 16787544

    public const val KEY_braille_dots_4578: Int = 16787672

    public const val KEY_braille_dots_458: Int = 16787608

    public const val KEY_braille_dots_46: Int = 16787496

    public const val KEY_braille_dots_467: Int = 16787560

    public const val KEY_braille_dots_4678: Int = 16787688

    public const val KEY_braille_dots_468: Int = 16787624

    public const val KEY_braille_dots_47: Int = 16787528

    public const val KEY_braille_dots_478: Int = 16787656

    public const val KEY_braille_dots_48: Int = 16787592

    public const val KEY_braille_dots_5: Int = 16787472

    public const val KEY_braille_dots_56: Int = 16787504

    public const val KEY_braille_dots_567: Int = 16787568

    public const val KEY_braille_dots_5678: Int = 16787696

    public const val KEY_braille_dots_568: Int = 16787632

    public const val KEY_braille_dots_57: Int = 16787536

    public const val KEY_braille_dots_578: Int = 16787664

    public const val KEY_braille_dots_58: Int = 16787600

    public const val KEY_braille_dots_6: Int = 16787488

    public const val KEY_braille_dots_67: Int = 16787552

    public const val KEY_braille_dots_678: Int = 16787680

    public const val KEY_braille_dots_68: Int = 16787616

    public const val KEY_braille_dots_7: Int = 16787520

    public const val KEY_braille_dots_78: Int = 16787648

    public const val KEY_braille_dots_8: Int = 16787584

    public const val KEY_breve: Int = 418

    public const val KEY_brokenbar: Int = 166

    public const val KEY_c: Int = 99

    public const val KEY_c_h: Int = 65187

    public const val KEY_cabovedot: Int = 741

    public const val KEY_cacute: Int = 486

    public const val KEY_careof: Int = 2744

    public const val KEY_caret: Int = 2812

    public const val KEY_caron: Int = 439

    public const val KEY_ccaron: Int = 488

    public const val KEY_ccedilla: Int = 231

    public const val KEY_ccircumflex: Int = 742

    public const val KEY_cedilla: Int = 184

    public const val KEY_cent: Int = 162

    public const val KEY_ch: Int = 65184

    public const val KEY_checkerboard: Int = 2529

    public const val KEY_checkmark: Int = 2803

    public const val KEY_circle: Int = 3023

    public const val KEY_club: Int = 2796

    public const val KEY_colon: Int = 58

    public const val KEY_comma: Int = 44

    public const val KEY_containsas: Int = 16785931

    public const val KEY_copyright: Int = 169

    public const val KEY_cr: Int = 2532

    public const val KEY_crossinglines: Int = 2542

    public const val KEY_cuberoot: Int = 16785947

    public const val KEY_currency: Int = 164

    public const val KEY_cursor: Int = 2815

    public const val KEY_d: Int = 100

    public const val KEY_dabovedot: Int = 16784907

    public const val KEY_dagger: Int = 2801

    public const val KEY_dcaron: Int = 495

    public const val KEY_dead_A: Int = 65153

    public const val KEY_dead_E: Int = 65155

    public const val KEY_dead_I: Int = 65157

    public const val KEY_dead_O: Int = 65159

    public const val KEY_dead_U: Int = 65161

    public const val KEY_dead_a: Int = 65152

    public const val KEY_dead_abovecomma: Int = 65124

    public const val KEY_dead_abovedot: Int = 65110

    public const val KEY_dead_abovereversedcomma: Int = 65125

    public const val KEY_dead_abovering: Int = 65112

    public const val KEY_dead_aboveverticalline: Int = 65169

    public const val KEY_dead_acute: Int = 65105

    public const val KEY_dead_belowbreve: Int = 65131

    public const val KEY_dead_belowcircumflex: Int = 65129

    public const val KEY_dead_belowcomma: Int = 65134

    public const val KEY_dead_belowdiaeresis: Int = 65132

    public const val KEY_dead_belowdot: Int = 65120

    public const val KEY_dead_belowmacron: Int = 65128

    public const val KEY_dead_belowring: Int = 65127

    public const val KEY_dead_belowtilde: Int = 65130

    public const val KEY_dead_belowverticalline: Int = 65170

    public const val KEY_dead_breve: Int = 65109

    public const val KEY_dead_capital_schwa: Int = 65163

    public const val KEY_dead_caron: Int = 65114

    public const val KEY_dead_cedilla: Int = 65115

    public const val KEY_dead_circumflex: Int = 65106

    public const val KEY_dead_currency: Int = 65135

    public const val KEY_dead_dasia: Int = 65125

    public const val KEY_dead_diaeresis: Int = 65111

    public const val KEY_dead_doubleacute: Int = 65113

    public const val KEY_dead_doublegrave: Int = 65126

    public const val KEY_dead_e: Int = 65154

    public const val KEY_dead_grave: Int = 65104

    public const val KEY_dead_greek: Int = 65164

    public const val KEY_dead_hook: Int = 65121

    public const val KEY_dead_horn: Int = 65122

    public const val KEY_dead_i: Int = 65156

    public const val KEY_dead_invertedbreve: Int = 65133

    public const val KEY_dead_iota: Int = 65117

    public const val KEY_dead_longsolidusoverlay: Int = 65171

    public const val KEY_dead_lowline: Int = 65168

    public const val KEY_dead_macron: Int = 65108

    public const val KEY_dead_o: Int = 65158

    public const val KEY_dead_ogonek: Int = 65116

    public const val KEY_dead_perispomeni: Int = 65107

    public const val KEY_dead_psili: Int = 65124

    public const val KEY_dead_semivoiced_sound: Int = 65119

    public const val KEY_dead_small_schwa: Int = 65162

    public const val KEY_dead_stroke: Int = 65123

    public const val KEY_dead_tilde: Int = 65107

    public const val KEY_dead_u: Int = 65160

    public const val KEY_dead_voiced_sound: Int = 65118

    public const val KEY_decimalpoint: Int = 2749

    public const val KEY_degree: Int = 176

    public const val KEY_diaeresis: Int = 168

    public const val KEY_diamond: Int = 2797

    public const val KEY_digitspace: Int = 2725

    public const val KEY_dintegral: Int = 16785964

    public const val KEY_division: Int = 247

    public const val KEY_dollar: Int = 36

    public const val KEY_doubbaselinedot: Int = 2735

    public const val KEY_doubleacute: Int = 445

    public const val KEY_doubledagger: Int = 2802

    public const val KEY_doublelowquotemark: Int = 2814

    public const val KEY_downarrow: Int = 2302

    public const val KEY_downcaret: Int = 2984

    public const val KEY_downshoe: Int = 3030

    public const val KEY_downstile: Int = 3012

    public const val KEY_downtack: Int = 3010

    public const val KEY_dstroke: Int = 496

    public const val KEY_e: Int = 101

    public const val KEY_eabovedot: Int = 1004

    public const val KEY_eacute: Int = 233

    public const val KEY_ebelowdot: Int = 16785081

    public const val KEY_ecaron: Int = 492

    public const val KEY_ecircumflex: Int = 234

    public const val KEY_ecircumflexacute: Int = 16785087

    public const val KEY_ecircumflexbelowdot: Int = 16785095

    public const val KEY_ecircumflexgrave: Int = 16785089

    public const val KEY_ecircumflexhook: Int = 16785091

    public const val KEY_ecircumflextilde: Int = 16785093

    public const val KEY_ediaeresis: Int = 235

    public const val KEY_egrave: Int = 232

    public const val KEY_ehook: Int = 16785083

    public const val KEY_eightsubscript: Int = 16785544

    public const val KEY_eightsuperior: Int = 16785528

    public const val KEY_elementof: Int = 16785928

    public const val KEY_ellipsis: Int = 2734

    public const val KEY_em3space: Int = 2723

    public const val KEY_em4space: Int = 2724

    public const val KEY_emacron: Int = 954

    public const val KEY_emdash: Int = 2729

    public const val KEY_emfilledcircle: Int = 2782

    public const val KEY_emfilledrect: Int = 2783

    public const val KEY_emopencircle: Int = 2766

    public const val KEY_emopenrectangle: Int = 2767

    public const val KEY_emptyset: Int = 16785925

    public const val KEY_emspace: Int = 2721

    public const val KEY_endash: Int = 2730

    public const val KEY_enfilledcircbullet: Int = 2790

    public const val KEY_enfilledsqbullet: Int = 2791

    public const val KEY_eng: Int = 959

    public const val KEY_enopencircbullet: Int = 2784

    public const val KEY_enopensquarebullet: Int = 2785

    public const val KEY_enspace: Int = 2722

    public const val KEY_eogonek: Int = 490

    public const val KEY_equal: Int = 61

    public const val KEY_eth: Int = 240

    public const val KEY_etilde: Int = 16785085

    public const val KEY_exclam: Int = 33

    public const val KEY_exclamdown: Int = 161

    public const val KEY_ezh: Int = 16777874

    public const val KEY_f: Int = 102

    public const val KEY_fabovedot: Int = 16784927

    public const val KEY_femalesymbol: Int = 2808

    public const val KEY_ff: Int = 2531

    public const val KEY_figdash: Int = 2747

    public const val KEY_filledlefttribullet: Int = 2780

    public const val KEY_filledrectbullet: Int = 2779

    public const val KEY_filledrighttribullet: Int = 2781

    public const val KEY_filledtribulletdown: Int = 2793

    public const val KEY_filledtribulletup: Int = 2792

    public const val KEY_fiveeighths: Int = 2757

    public const val KEY_fivesixths: Int = 2743

    public const val KEY_fivesubscript: Int = 16785541

    public const val KEY_fivesuperior: Int = 16785525

    public const val KEY_fourfifths: Int = 2741

    public const val KEY_foursubscript: Int = 16785540

    public const val KEY_foursuperior: Int = 16785524

    public const val KEY_fourthroot: Int = 16785948

    public const val KEY_function: Int = 2294

    public const val KEY_g: Int = 103

    public const val KEY_gabovedot: Int = 757

    public const val KEY_gbreve: Int = 699

    public const val KEY_gcaron: Int = 16777703

    public const val KEY_gcedilla: Int = 955

    public const val KEY_gcircumflex: Int = 760

    public const val KEY_grave: Int = 96

    public const val KEY_greater: Int = 62

    public const val KEY_greaterthanequal: Int = 2238

    public const val KEY_guillemotleft: Int = 171

    public const val KEY_guillemotright: Int = 187

    public const val KEY_h: Int = 104

    public const val KEY_hairspace: Int = 2728

    public const val KEY_hcircumflex: Int = 694

    public const val KEY_heart: Int = 2798

    public const val KEY_hebrew_aleph: Int = 3296

    public const val KEY_hebrew_ayin: Int = 3314

    public const val KEY_hebrew_bet: Int = 3297

    public const val KEY_hebrew_beth: Int = 3297

    public const val KEY_hebrew_chet: Int = 3303

    public const val KEY_hebrew_dalet: Int = 3299

    public const val KEY_hebrew_daleth: Int = 3299

    public const val KEY_hebrew_doublelowline: Int = 3295

    public const val KEY_hebrew_finalkaph: Int = 3306

    public const val KEY_hebrew_finalmem: Int = 3309

    public const val KEY_hebrew_finalnun: Int = 3311

    public const val KEY_hebrew_finalpe: Int = 3315

    public const val KEY_hebrew_finalzade: Int = 3317

    public const val KEY_hebrew_finalzadi: Int = 3317

    public const val KEY_hebrew_gimel: Int = 3298

    public const val KEY_hebrew_gimmel: Int = 3298

    public const val KEY_hebrew_he: Int = 3300

    public const val KEY_hebrew_het: Int = 3303

    public const val KEY_hebrew_kaph: Int = 3307

    public const val KEY_hebrew_kuf: Int = 3319

    public const val KEY_hebrew_lamed: Int = 3308

    public const val KEY_hebrew_mem: Int = 3310

    public const val KEY_hebrew_nun: Int = 3312

    public const val KEY_hebrew_pe: Int = 3316

    public const val KEY_hebrew_qoph: Int = 3319

    public const val KEY_hebrew_resh: Int = 3320

    public const val KEY_hebrew_samech: Int = 3313

    public const val KEY_hebrew_samekh: Int = 3313

    public const val KEY_hebrew_shin: Int = 3321

    public const val KEY_hebrew_taf: Int = 3322

    public const val KEY_hebrew_taw: Int = 3322

    public const val KEY_hebrew_tet: Int = 3304

    public const val KEY_hebrew_teth: Int = 3304

    public const val KEY_hebrew_waw: Int = 3301

    public const val KEY_hebrew_yod: Int = 3305

    public const val KEY_hebrew_zade: Int = 3318

    public const val KEY_hebrew_zadi: Int = 3318

    public const val KEY_hebrew_zain: Int = 3302

    public const val KEY_hebrew_zayin: Int = 3302

    public const val KEY_hexagram: Int = 2778

    public const val KEY_horizconnector: Int = 2211

    public const val KEY_horizlinescan1: Int = 2543

    public const val KEY_horizlinescan3: Int = 2544

    public const val KEY_horizlinescan5: Int = 2545

    public const val KEY_horizlinescan7: Int = 2546

    public const val KEY_horizlinescan9: Int = 2547

    public const val KEY_hstroke: Int = 689

    public const val KEY_ht: Int = 2530

    public const val KEY_hyphen: Int = 173

    public const val KEY_i: Int = 105

    public const val KEY_iTouch: Int = 269025120

    public const val KEY_iacute: Int = 237

    public const val KEY_ibelowdot: Int = 16785099

    public const val KEY_ibreve: Int = 16777517

    public const val KEY_icircumflex: Int = 238

    public const val KEY_identical: Int = 2255

    public const val KEY_idiaeresis: Int = 239

    public const val KEY_idotless: Int = 697

    public const val KEY_ifonlyif: Int = 2253

    public const val KEY_igrave: Int = 236

    public const val KEY_ihook: Int = 16785097

    public const val KEY_imacron: Int = 1007

    public const val KEY_implies: Int = 2254

    public const val KEY_includedin: Int = 2266

    public const val KEY_includes: Int = 2267

    public const val KEY_infinity: Int = 2242

    public const val KEY_integral: Int = 2239

    public const val KEY_intersection: Int = 2268

    public const val KEY_iogonek: Int = 999

    public const val KEY_itilde: Int = 949

    public const val KEY_j: Int = 106

    public const val KEY_jcircumflex: Int = 700

    public const val KEY_jot: Int = 3018

    public const val KEY_k: Int = 107

    public const val KEY_kana_A: Int = 1201

    public const val KEY_kana_CHI: Int = 1217

    public const val KEY_kana_E: Int = 1204

    public const val KEY_kana_FU: Int = 1228

    public const val KEY_kana_HA: Int = 1226

    public const val KEY_kana_HE: Int = 1229

    public const val KEY_kana_HI: Int = 1227

    public const val KEY_kana_HO: Int = 1230

    public const val KEY_kana_HU: Int = 1228

    public const val KEY_kana_I: Int = 1202

    public const val KEY_kana_KA: Int = 1206

    public const val KEY_kana_KE: Int = 1209

    public const val KEY_kana_KI: Int = 1207

    public const val KEY_kana_KO: Int = 1210

    public const val KEY_kana_KU: Int = 1208

    public const val KEY_kana_MA: Int = 1231

    public const val KEY_kana_ME: Int = 1234

    public const val KEY_kana_MI: Int = 1232

    public const val KEY_kana_MO: Int = 1235

    public const val KEY_kana_MU: Int = 1233

    public const val KEY_kana_N: Int = 1245

    public const val KEY_kana_NA: Int = 1221

    public const val KEY_kana_NE: Int = 1224

    public const val KEY_kana_NI: Int = 1222

    public const val KEY_kana_NO: Int = 1225

    public const val KEY_kana_NU: Int = 1223

    public const val KEY_kana_O: Int = 1205

    public const val KEY_kana_RA: Int = 1239

    public const val KEY_kana_RE: Int = 1242

    public const val KEY_kana_RI: Int = 1240

    public const val KEY_kana_RO: Int = 1243

    public const val KEY_kana_RU: Int = 1241

    public const val KEY_kana_SA: Int = 1211

    public const val KEY_kana_SE: Int = 1214

    public const val KEY_kana_SHI: Int = 1212

    public const val KEY_kana_SO: Int = 1215

    public const val KEY_kana_SU: Int = 1213

    public const val KEY_kana_TA: Int = 1216

    public const val KEY_kana_TE: Int = 1219

    public const val KEY_kana_TI: Int = 1217

    public const val KEY_kana_TO: Int = 1220

    public const val KEY_kana_TSU: Int = 1218

    public const val KEY_kana_TU: Int = 1218

    public const val KEY_kana_U: Int = 1203

    public const val KEY_kana_WA: Int = 1244

    public const val KEY_kana_WO: Int = 1190

    public const val KEY_kana_YA: Int = 1236

    public const val KEY_kana_YO: Int = 1238

    public const val KEY_kana_YU: Int = 1237

    public const val KEY_kana_a: Int = 1191

    public const val KEY_kana_closingbracket: Int = 1187

    public const val KEY_kana_comma: Int = 1188

    public const val KEY_kana_conjunctive: Int = 1189

    public const val KEY_kana_e: Int = 1194

    public const val KEY_kana_fullstop: Int = 1185

    public const val KEY_kana_i: Int = 1192

    public const val KEY_kana_middledot: Int = 1189

    public const val KEY_kana_o: Int = 1195

    public const val KEY_kana_openingbracket: Int = 1186

    public const val KEY_kana_switch: Int = 65406

    public const val KEY_kana_tsu: Int = 1199

    public const val KEY_kana_tu: Int = 1199

    public const val KEY_kana_u: Int = 1193

    public const val KEY_kana_ya: Int = 1196

    public const val KEY_kana_yo: Int = 1198

    public const val KEY_kana_yu: Int = 1197

    public const val KEY_kappa: Int = 930

    public const val KEY_kcedilla: Int = 1011

    public const val KEY_kra: Int = 930

    public const val KEY_l: Int = 108

    public const val KEY_lacute: Int = 485

    public const val KEY_latincross: Int = 2777

    public const val KEY_lbelowdot: Int = 16784951

    public const val KEY_lcaron: Int = 437

    public const val KEY_lcedilla: Int = 950

    public const val KEY_leftanglebracket: Int = 2748

    public const val KEY_leftarrow: Int = 2299

    public const val KEY_leftcaret: Int = 2979

    public const val KEY_leftdoublequotemark: Int = 2770

    public const val KEY_leftmiddlecurlybrace: Int = 2223

    public const val KEY_leftopentriangle: Int = 2764

    public const val KEY_leftpointer: Int = 2794

    public const val KEY_leftradical: Int = 2209

    public const val KEY_leftshoe: Int = 3034

    public const val KEY_leftsinglequotemark: Int = 2768

    public const val KEY_leftt: Int = 2548

    public const val KEY_lefttack: Int = 3036

    public const val KEY_less: Int = 60

    public const val KEY_lessthanequal: Int = 2236

    public const val KEY_lf: Int = 2533

    public const val KEY_logicaland: Int = 2270

    public const val KEY_logicalor: Int = 2271

    public const val KEY_lowleftcorner: Int = 2541

    public const val KEY_lowrightcorner: Int = 2538

    public const val KEY_lstroke: Int = 435

    public const val KEY_m: Int = 109

    public const val KEY_mabovedot: Int = 16784961

    public const val KEY_macron: Int = 175

    public const val KEY_malesymbol: Int = 2807

    public const val KEY_maltesecross: Int = 2800

    public const val KEY_marker: Int = 2751

    public const val KEY_masculine: Int = 186

    public const val KEY_minus: Int = 45

    public const val KEY_minutes: Int = 2774

    public const val KEY_mu: Int = 181

    public const val KEY_multiply: Int = 215

    public const val KEY_musicalflat: Int = 2806

    public const val KEY_musicalsharp: Int = 2805

    public const val KEY_n: Int = 110

    public const val KEY_nabla: Int = 2245

    public const val KEY_nacute: Int = 497

    public const val KEY_ncaron: Int = 498

    public const val KEY_ncedilla: Int = 1009

    public const val KEY_ninesubscript: Int = 16785545

    public const val KEY_ninesuperior: Int = 16785529

    public const val KEY_nl: Int = 2536

    public const val KEY_nobreakspace: Int = 160

    public const val KEY_notapproxeq: Int = 16785991

    public const val KEY_notelementof: Int = 16785929

    public const val KEY_notequal: Int = 2237

    public const val KEY_notidentical: Int = 16786018

    public const val KEY_notsign: Int = 172

    public const val KEY_ntilde: Int = 241

    public const val KEY_numbersign: Int = 35

    public const val KEY_numerosign: Int = 1712

    public const val KEY_o: Int = 111

    public const val KEY_oacute: Int = 243

    public const val KEY_obarred: Int = 16777845

    public const val KEY_obelowdot: Int = 16785101

    public const val KEY_ocaron: Int = 16777682

    public const val KEY_ocircumflex: Int = 244

    public const val KEY_ocircumflexacute: Int = 16785105

    public const val KEY_ocircumflexbelowdot: Int = 16785113

    public const val KEY_ocircumflexgrave: Int = 16785107

    public const val KEY_ocircumflexhook: Int = 16785109

    public const val KEY_ocircumflextilde: Int = 16785111

    public const val KEY_odiaeresis: Int = 246

    public const val KEY_odoubleacute: Int = 501

    public const val KEY_oe: Int = 5053

    public const val KEY_ogonek: Int = 434

    public const val KEY_ograve: Int = 242

    public const val KEY_ohook: Int = 16785103

    public const val KEY_ohorn: Int = 16777633

    public const val KEY_ohornacute: Int = 16785115

    public const val KEY_ohornbelowdot: Int = 16785123

    public const val KEY_ohorngrave: Int = 16785117

    public const val KEY_ohornhook: Int = 16785119

    public const val KEY_ohorntilde: Int = 16785121

    public const val KEY_omacron: Int = 1010

    public const val KEY_oneeighth: Int = 2755

    public const val KEY_onefifth: Int = 2738

    public const val KEY_onehalf: Int = 189

    public const val KEY_onequarter: Int = 188

    public const val KEY_onesixth: Int = 2742

    public const val KEY_onesubscript: Int = 16785537

    public const val KEY_onesuperior: Int = 185

    public const val KEY_onethird: Int = 2736

    public const val KEY_ooblique: Int = 248

    public const val KEY_openrectbullet: Int = 2786

    public const val KEY_openstar: Int = 2789

    public const val KEY_opentribulletdown: Int = 2788

    public const val KEY_opentribulletup: Int = 2787

    public const val KEY_ordfeminine: Int = 170

    public const val KEY_oslash: Int = 248

    public const val KEY_otilde: Int = 245

    public const val KEY_overbar: Int = 3008

    public const val KEY_overline: Int = 1150

    public const val KEY_p: Int = 112

    public const val KEY_pabovedot: Int = 16784983

    public const val KEY_paragraph: Int = 182

    public const val KEY_parenleft: Int = 40

    public const val KEY_parenright: Int = 41

    public const val KEY_partdifferential: Int = 16785922

    public const val KEY_partialderivative: Int = 2287

    public const val KEY_percent: Int = 37

    public const val KEY_period: Int = 46

    public const val KEY_periodcentered: Int = 183

    public const val KEY_permille: Int = 2773

    public const val KEY_phonographcopyright: Int = 2811

    public const val KEY_plus: Int = 43

    public const val KEY_plusminus: Int = 177

    public const val KEY_prescription: Int = 2772

    public const val KEY_prolongedsound: Int = 1200

    public const val KEY_punctspace: Int = 2726

    public const val KEY_q: Int = 113

    public const val KEY_quad: Int = 3020

    public const val KEY_question: Int = 63

    public const val KEY_questiondown: Int = 191

    public const val KEY_quotedbl: Int = 34

    public const val KEY_quoteleft: Int = 96

    public const val KEY_quoteright: Int = 39

    public const val KEY_r: Int = 114

    public const val KEY_racute: Int = 480

    public const val KEY_radical: Int = 2262

    public const val KEY_rcaron: Int = 504

    public const val KEY_rcedilla: Int = 947

    public const val KEY_registered: Int = 174

    public const val KEY_rightanglebracket: Int = 2750

    public const val KEY_rightarrow: Int = 2301

    public const val KEY_rightcaret: Int = 2982

    public const val KEY_rightdoublequotemark: Int = 2771

    public const val KEY_rightmiddlecurlybrace: Int = 2224

    public const val KEY_rightmiddlesummation: Int = 2231

    public const val KEY_rightopentriangle: Int = 2765

    public const val KEY_rightpointer: Int = 2795

    public const val KEY_rightshoe: Int = 3032

    public const val KEY_rightsinglequotemark: Int = 2769

    public const val KEY_rightt: Int = 2549

    public const val KEY_righttack: Int = 3068

    public const val KEY_s: Int = 115

    public const val KEY_sabovedot: Int = 16784993

    public const val KEY_sacute: Int = 438

    public const val KEY_scaron: Int = 441

    public const val KEY_scedilla: Int = 442

    public const val KEY_schwa: Int = 16777817

    public const val KEY_scircumflex: Int = 766

    public const val KEY_script_switch: Int = 65406

    public const val KEY_seconds: Int = 2775

    public const val KEY_section: Int = 167

    public const val KEY_semicolon: Int = 59

    public const val KEY_semivoicedsound: Int = 1247

    public const val KEY_seveneighths: Int = 2758

    public const val KEY_sevensubscript: Int = 16785543

    public const val KEY_sevensuperior: Int = 16785527

    public const val KEY_signaturemark: Int = 2762

    public const val KEY_signifblank: Int = 2732

    public const val KEY_similarequal: Int = 2249

    public const val KEY_singlelowquotemark: Int = 2813

    public const val KEY_sixsubscript: Int = 16785542

    public const val KEY_sixsuperior: Int = 16785526

    public const val KEY_slash: Int = 47

    public const val KEY_soliddiamond: Int = 2528

    public const val KEY_space: Int = 32

    public const val KEY_squareroot: Int = 16785946

    public const val KEY_ssharp: Int = 223

    public const val KEY_sterling: Int = 163

    public const val KEY_stricteq: Int = 16786019

    public const val KEY_t: Int = 116

    public const val KEY_tabovedot: Int = 16785003

    public const val KEY_tcaron: Int = 443

    public const val KEY_tcedilla: Int = 510

    public const val KEY_telephone: Int = 2809

    public const val KEY_telephonerecorder: Int = 2810

    public const val KEY_therefore: Int = 2240

    public const val KEY_thinspace: Int = 2727

    public const val KEY_thorn: Int = 254

    public const val KEY_threeeighths: Int = 2756

    public const val KEY_threefifths: Int = 2740

    public const val KEY_threequarters: Int = 190

    public const val KEY_threesubscript: Int = 16785539

    public const val KEY_threesuperior: Int = 179

    public const val KEY_tintegral: Int = 16785965

    public const val KEY_topintegral: Int = 2212

    public const val KEY_topleftparens: Int = 2219

    public const val KEY_topleftradical: Int = 2210

    public const val KEY_topleftsqbracket: Int = 2215

    public const val KEY_topleftsummation: Int = 2225

    public const val KEY_toprightparens: Int = 2221

    public const val KEY_toprightsqbracket: Int = 2217

    public const val KEY_toprightsummation: Int = 2229

    public const val KEY_topt: Int = 2551

    public const val KEY_topvertsummationconnector: Int = 2227

    public const val KEY_trademark: Int = 2761

    public const val KEY_trademarkincircle: Int = 2763

    public const val KEY_tslash: Int = 956

    public const val KEY_twofifths: Int = 2739

    public const val KEY_twosubscript: Int = 16785538

    public const val KEY_twosuperior: Int = 178

    public const val KEY_twothirds: Int = 2737

    public const val KEY_u: Int = 117

    public const val KEY_uacute: Int = 250

    public const val KEY_ubelowdot: Int = 16785125

    public const val KEY_ubreve: Int = 765

    public const val KEY_ucircumflex: Int = 251

    public const val KEY_udiaeresis: Int = 252

    public const val KEY_udoubleacute: Int = 507

    public const val KEY_ugrave: Int = 249

    public const val KEY_uhook: Int = 16785127

    public const val KEY_uhorn: Int = 16777648

    public const val KEY_uhornacute: Int = 16785129

    public const val KEY_uhornbelowdot: Int = 16785137

    public const val KEY_uhorngrave: Int = 16785131

    public const val KEY_uhornhook: Int = 16785133

    public const val KEY_uhorntilde: Int = 16785135

    public const val KEY_umacron: Int = 1022

    public const val KEY_underbar: Int = 3014

    public const val KEY_underscore: Int = 95

    public const val KEY_union: Int = 2269

    public const val KEY_uogonek: Int = 1017

    public const val KEY_uparrow: Int = 2300

    public const val KEY_upcaret: Int = 2985

    public const val KEY_upleftcorner: Int = 2540

    public const val KEY_uprightcorner: Int = 2539

    public const val KEY_upshoe: Int = 3011

    public const val KEY_upstile: Int = 3027

    public const val KEY_uptack: Int = 3022

    public const val KEY_uring: Int = 505

    public const val KEY_utilde: Int = 1021

    public const val KEY_v: Int = 118

    public const val KEY_variation: Int = 2241

    public const val KEY_vertbar: Int = 2552

    public const val KEY_vertconnector: Int = 2214

    public const val KEY_voicedsound: Int = 1246

    public const val KEY_vt: Int = 2537

    public const val KEY_w: Int = 119

    public const val KEY_wacute: Int = 16785027

    public const val KEY_wcircumflex: Int = 16777589

    public const val KEY_wdiaeresis: Int = 16785029

    public const val KEY_wgrave: Int = 16785025

    public const val KEY_x: Int = 120

    public const val KEY_xabovedot: Int = 16785035

    public const val KEY_y: Int = 121

    public const val KEY_yacute: Int = 253

    public const val KEY_ybelowdot: Int = 16785141

    public const val KEY_ycircumflex: Int = 16777591

    public const val KEY_ydiaeresis: Int = 255

    public const val KEY_yen: Int = 165

    public const val KEY_ygrave: Int = 16785139

    public const val KEY_yhook: Int = 16785143

    public const val KEY_ytilde: Int = 16785145

    public const val KEY_z: Int = 122

    public const val KEY_zabovedot: Int = 447

    public const val KEY_zacute: Int = 444

    public const val KEY_zcaron: Int = 446

    public const val KEY_zerosubscript: Int = 16785536

    public const val KEY_zerosuperior: Int = 16785520

    public const val KEY_zstroke: Int = 16777654

    /**
     * A mask covering all entries in `GdkModifierType`.
     */
    public const val MODIFIER_MASK: Int = 469769999

    /**
     * This is the priority that the idle handler processing surface updates
     * is given in the main loop.
     */
    public const val PRIORITY_REDRAW: Int = 120

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
        type: ULong,
        ioPriority: Int,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        gdk_content_deserialize_async(
            stream.gioInputStreamPointer.reinterpret(),
            mimeType,
            type,
            ioPriority,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
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
    public fun contentDeserializeFinish(
        result: AsyncResult,
        `value`: Value,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gdk_content_deserialize_finish(
                    result.gioAsyncResultPointer,
                    `value`.gobjectValuePointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(
                    org.gtkkn.bindings.gdk.Gdk
                        .resolveException(Error(gError.pointed!!.ptr))
                )
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Parses the given @string into `GdkContentFormats` and
     * returns the formats.
     *
     * Strings printed via [method@Gdk.ContentFormats.to_string]
     * can be read in again successfully using this function.
     *
     * If @string does not describe valid content formats, null
     * is returned.
     *
     * @param string the string to parse
     * @return the content formats if @string is valid
     * @since 4.4
     */
    public fun contentFormatsParse(string: String): ContentFormats? =
        gdk_content_formats_parse(string)?.run {
            ContentFormats(reinterpret())
        }

    /**
     * Registers a function to deserialize object of a given type.
     *
     * @param mimeType the mime type which the function can deserialize from
     * @param type the type of objects that the function creates
     * @param deserialize the callback
     */
    public fun contentRegisterDeserializer(
        mimeType: String,
        type: ULong,
        deserialize: ContentDeserializeFunc,
    ): Unit =
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
    public fun contentRegisterSerializer(
        type: ULong,
        mimeType: String,
        serialize: ContentSerializeFunc,
    ): Unit =
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
        ioPriority: Int,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        gdk_content_serialize_async(
            stream.gioOutputStreamPointer.reinterpret(),
            mimeType,
            `value`.gobjectValuePointer,
            ioPriority,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes a content serialization operation.
     *
     * @param result the `GAsyncResult`
     * @return true if the operation was successful, false if an
     *   error occurred. In this case, @error is set
     */
    public fun contentSerializeFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gdk_content_serialize_finish(result.gioAsyncResultPointer, gError.ptr).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(
                    org.gtkkn.bindings.gdk.Gdk
                        .resolveException(Error(gError.pointed!!.ptr))
                )
            } else {
                Result.success(gResult)
            }
        }

    public fun dmabufErrorQuark(): UInt = gdk_dmabuf_error_quark()

    /**
     * Checks if @action represents a single action or includes
     * multiple actions.
     *
     * When @action is 0 - ie no action was given, true
     * is returned.
     *
     * @param action a `GdkDragAction`
     * @return true if exactly one action was given
     */
    public fun dragActionIsUnique(action: DragAction): Boolean = gdk_drag_action_is_unique(action.mask).asBoolean()

    public fun dragSurfaceSizeGetType(): ULong = gdk_drag_surface_size_get_type()

    public fun glErrorQuark(): UInt = gdk_gl_error_quark()

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
    public fun keyvalFromName(keyvalName: String): UInt = gdk_keyval_from_name(keyvalName)

    /**
     * Returns true if the given key value is in lower case.
     *
     * @param keyval a key value.
     * @return true if @keyval is in lower case, or if @keyval is not
     *   subject to case conversion.
     */
    public fun keyvalIsLower(keyval: UInt): Boolean = gdk_keyval_is_lower(keyval).asBoolean()

    /**
     * Returns true if the given key value is in upper case.
     *
     * @param keyval a key value.
     * @return true if @keyval is in upper case, or if @keyval is not subject to
     *  case conversion.
     */
    public fun keyvalIsUpper(keyval: UInt): Boolean = gdk_keyval_is_upper(keyval).asBoolean()

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
    public fun keyvalName(keyval: UInt): String? = gdk_keyval_name(keyval)?.toKString()

    /**
     * Converts a key value to lower case, if applicable.
     *
     * @param keyval a key value.
     * @return the lower case form of @keyval, or @keyval itself if it is already
     *  in lower case or it is not subject to case conversion.
     */
    public fun keyvalToLower(keyval: UInt): UInt = gdk_keyval_to_lower(keyval)

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
    public fun keyvalToUnicode(keyval: UInt): UInt = gdk_keyval_to_unicode(keyval)

    /**
     * Converts a key value to upper case, if applicable.
     *
     * @param keyval a key value.
     * @return the upper case form of @keyval, or @keyval itself if it is already
     *   in upper case or it is not subject to case conversion.
     */
    public fun keyvalToUpper(keyval: UInt): UInt = gdk_keyval_to_upper(keyval)

    /**
     * Returns a paintable that has the given intrinsic size and draws nothing.
     *
     * This is often useful for implementing the
     * [vfunc@Gdk.Paintable.get_current_image] virtual function
     * when the paintable is in an incomplete state (like a
     * [GtkMediaStream](../gtk4/class.MediaStream.html) before receiving
     * the first frame).
     *
     * @param intrinsicWidth The intrinsic width to report. Can be 0 for no width.
     * @param intrinsicHeight The intrinsic height to report. Can be 0 for no height.
     * @return a `GdkPaintable`
     */
    public fun paintableNewEmpty(
        intrinsicWidth: Int,
        intrinsicHeight: Int,
    ): Paintable =
        gdk_paintable_new_empty(intrinsicWidth, intrinsicHeight)!!.run {
            Paintable.wrap(reinterpret())
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

    public fun textureErrorQuark(): UInt = gdk_texture_error_quark()

    public fun toplevelSizeGetType(): ULong = gdk_toplevel_size_get_type()

    /**
     * Convert from a Unicode character to a key symbol.
     *
     * @param wc a Unicode character
     * @return the corresponding GDK key symbol, if one exists.
     *   or, if there is no corresponding symbol, wc | 0x01000000
     */
    public fun unicodeToKeyval(wc: UInt): UInt = gdk_unicode_to_keyval(wc)

    public fun vulkanErrorQuark(): UInt = gdk_vulkan_error_quark()

    public fun resolveException(error: Error): GlibException {
        val ex =
            when (error.domain) {
                DmabufError.quark() ->
                    DmabufError
                        .fromErrorOrNull(error)
                        ?.let {
                            DmabufErrorException(error, it)
                        }
                GLError.quark() ->
                    GLError
                        .fromErrorOrNull(error)
                        ?.let {
                            GLErrorException(error, it)
                        }
                TextureError.quark() ->
                    TextureError
                        .fromErrorOrNull(error)
                        ?.let {
                            TextureErrorException(error, it)
                        }
                VulkanError.quark() ->
                    VulkanError
                        .fromErrorOrNull(error)
                        ?.let {
                            VulkanErrorException(error, it)
                        }
                else -> null
            }
        return ex ?: GlibException(error)
    }
}

public val ContentDeserializeFuncFunc:
    CPointer<CFunction<(CPointer<GdkContentDeserializer>) -> Unit>> =
    staticCFunction {
            deserializer: CPointer<GdkContentDeserializer>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(deserializer: ContentDeserializer) -> Unit>().get().invoke(
            deserializer!!.run {
                ContentDeserializer(reinterpret())
            }
        )
    }.reinterpret()

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
    }.reinterpret()

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
