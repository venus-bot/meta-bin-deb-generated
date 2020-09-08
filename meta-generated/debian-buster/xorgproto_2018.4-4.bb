PACKAGES = "${PN} x11proto-core-dev x11proto-dev x11proto-input-dev x11proto-kb-dev"
PROVIDES = "x11proto-core-dev x11proto-dev x11proto-input-dev x11proto-kb-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/x/xorgproto/x11proto-core-dev_2018.4-4_all.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/x/xorgproto/x11proto-dev_2018.4-4_all.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/x/xorgproto/x11proto-input-dev_2018.4-4_all.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/x/xorgproto/x11proto-kb-dev_2018.4-4_all.deb;unpack=0;name=deb3\
"
DEBFILENAME_x11proto-core-dev = "x11proto-core-dev_2018.4-4_all.deb"
SRC_URI[deb0.sha256sum] = "8bdb72e48cac24f5a6b284fea4d2bd6cb11cbe5fba2345ce57d8017ac40243cb"
SRC_URI[deb0.md5sum] = "c2e86fe4cc308174d717b3ab6ab81553"
DEBFILENAME_x11proto-dev = "x11proto-dev_2018.4-4_all.deb"
SRC_URI[deb1.sha256sum] = "aa0237467fcb5ccabf6a93fc19fae4d76d8c6dfbf9e449edda5f6393e50d8674"
SRC_URI[deb1.md5sum] = "3ce53a6e841c0769bb3e1eb4d7b75123"
DEBFILENAME_x11proto-input-dev = "x11proto-input-dev_2018.4-4_all.deb"
SRC_URI[deb2.sha256sum] = "364edce8bb7cf3187c1e81d37ea5b8f6b6ddd3a74c4c82efa1810dd451bbddbf"
SRC_URI[deb2.md5sum] = "4448c50ec2e6653f8d7a11897bd40e74"
DEBFILENAME_x11proto-kb-dev = "x11proto-kb-dev_2018.4-4_all.deb"
SRC_URI[deb3.sha256sum] = "14df9b61bf65d8cb8b6053c2bc8f993454e8076d2a5ebc4e8d2bfe671c0592e3"
SRC_URI[deb3.md5sum] = "c45f26a004ccd95e8ffa487c2aba00f6"

RDEPENDS_x11proto-core-dev = "x11proto-dev"
RDEPENDS_x11proto-dev = "xorg-sgml-doctools (>= 1:1.5)"
RDEPENDS_x11proto-input-dev = "x11proto-dev"
RDEPENDS_x11proto-kb-dev = "x11proto-dev"
DEPENDS = "xorg-sgml-doctools"


inherit deb_group

FILES_x11proto-core-dev = " \
    ./usr/share/doc/x11proto-core-dev/changelog.Debian.gz \
    ./usr/share/doc/x11proto-core-dev/copyright\
"
FILES_x11proto-dev = " \
    ./usr/include/GL/glxint.h \
    ./usr/include/GL/glxmd.h \
    ./usr/include/GL/glxproto.h \
    ./usr/include/GL/glxtokens.h \
    ./usr/include/GL/internal/glcore.h \
    ./usr/include/X11/DECkeysym.h \
    ./usr/include/X11/HPkeysym.h \
    ./usr/include/X11/Sunkeysym.h \
    ./usr/include/X11/X.h \
    ./usr/include/X11/XF86keysym.h \
    ./usr/include/X11/XWDFile.h \
    ./usr/include/X11/Xalloca.h \
    ./usr/include/X11/Xarch.h \
    ./usr/include/X11/Xatom.h \
    ./usr/include/X11/Xdefs.h \
    ./usr/include/X11/Xfuncproto.h \
    ./usr/include/X11/Xfuncs.h \
    ./usr/include/X11/Xmd.h \
    ./usr/include/X11/Xos.h \
    ./usr/include/X11/Xos_r.h \
    ./usr/include/X11/Xosdefs.h \
    ./usr/include/X11/Xpoll.h \
    ./usr/include/X11/Xproto.h \
    ./usr/include/X11/Xprotostr.h \
    ./usr/include/X11/Xthreads.h \
    ./usr/include/X11/Xw32defs.h \
    ./usr/include/X11/Xwindows.h \
    ./usr/include/X11/Xwinsock.h \
    ./usr/include/X11/ap_keysym.h \
    ./usr/include/X11/dri/xf86dri.h \
    ./usr/include/X11/dri/xf86driproto.h \
    ./usr/include/X11/dri/xf86dristr.h \
    ./usr/include/X11/extensions/EVI.h \
    ./usr/include/X11/extensions/EVIproto.h \
    ./usr/include/X11/extensions/XI.h \
    ./usr/include/X11/extensions/XI2.h \
    ./usr/include/X11/extensions/XI2proto.h \
    ./usr/include/X11/extensions/XIproto.h \
    ./usr/include/X11/extensions/XKB.h \
    ./usr/include/X11/extensions/XKBgeom.h \
    ./usr/include/X11/extensions/XKBproto.h \
    ./usr/include/X11/extensions/XKBsrv.h \
    ./usr/include/X11/extensions/XKBstr.h \
    ./usr/include/X11/extensions/XResproto.h \
    ./usr/include/X11/extensions/Xv.h \
    ./usr/include/X11/extensions/XvMC.h \
    ./usr/include/X11/extensions/XvMCproto.h \
    ./usr/include/X11/extensions/Xvproto.h \
    ./usr/include/X11/extensions/ag.h \
    ./usr/include/X11/extensions/agproto.h \
    ./usr/include/X11/extensions/applewmconst.h \
    ./usr/include/X11/extensions/applewmproto.h \
    ./usr/include/X11/extensions/bigreqsproto.h \
    ./usr/include/X11/extensions/bigreqstr.h \
    ./usr/include/X11/extensions/composite.h \
    ./usr/include/X11/extensions/compositeproto.h \
    ./usr/include/X11/extensions/cup.h \
    ./usr/include/X11/extensions/cupproto.h \
    ./usr/include/X11/extensions/damageproto.h \
    ./usr/include/X11/extensions/damagewire.h \
    ./usr/include/X11/extensions/dbe.h \
    ./usr/include/X11/extensions/dbeproto.h \
    ./usr/include/X11/extensions/dmx.h \
    ./usr/include/X11/extensions/dmxproto.h \
    ./usr/include/X11/extensions/dpmsconst.h \
    ./usr/include/X11/extensions/dpmsproto.h \
    ./usr/include/X11/extensions/dri2proto.h \
    ./usr/include/X11/extensions/dri2tokens.h \
    ./usr/include/X11/extensions/dri3proto.h \
    ./usr/include/X11/extensions/ge.h \
    ./usr/include/X11/extensions/geproto.h \
    ./usr/include/X11/extensions/lbx.h \
    ./usr/include/X11/extensions/lbxproto.h \
    ./usr/include/X11/extensions/mitmiscconst.h \
    ./usr/include/X11/extensions/mitmiscproto.h \
    ./usr/include/X11/extensions/multibufconst.h \
    ./usr/include/X11/extensions/multibufproto.h \
    ./usr/include/X11/extensions/panoramiXproto.h \
    ./usr/include/X11/extensions/presentproto.h \
    ./usr/include/X11/extensions/presenttokens.h \
    ./usr/include/X11/extensions/randr.h \
    ./usr/include/X11/extensions/randrproto.h \
    ./usr/include/X11/extensions/recordconst.h \
    ./usr/include/X11/extensions/recordproto.h \
    ./usr/include/X11/extensions/recordstr.h \
    ./usr/include/X11/extensions/render.h \
    ./usr/include/X11/extensions/renderproto.h \
    ./usr/include/X11/extensions/saver.h \
    ./usr/include/X11/extensions/saverproto.h \
    ./usr/include/X11/extensions/secur.h \
    ./usr/include/X11/extensions/securproto.h \
    ./usr/include/X11/extensions/shapeconst.h \
    ./usr/include/X11/extensions/shapeproto.h \
    ./usr/include/X11/extensions/shapestr.h \
    ./usr/include/X11/extensions/shm.h \
    ./usr/include/X11/extensions/shmproto.h \
    ./usr/include/X11/extensions/shmstr.h \
    ./usr/include/X11/extensions/syncconst.h \
    ./usr/include/X11/extensions/syncproto.h \
    ./usr/include/X11/extensions/syncstr.h \
    ./usr/include/X11/extensions/vldXvMC.h \
    ./usr/include/X11/extensions/windowswm.h \
    ./usr/include/X11/extensions/windowswmstr.h \
    ./usr/include/X11/extensions/xcmiscproto.h \
    ./usr/include/X11/extensions/xcmiscstr.h \
    ./usr/include/X11/extensions/xf86bigfont.h \
    ./usr/include/X11/extensions/xf86bigfproto.h \
    ./usr/include/X11/extensions/xf86bigfstr.h \
    ./usr/include/X11/extensions/xf86dga.h \
    ./usr/include/X11/extensions/xf86dga1const.h \
    ./usr/include/X11/extensions/xf86dga1proto.h \
    ./usr/include/X11/extensions/xf86dga1str.h \
    ./usr/include/X11/extensions/xf86dgaconst.h \
    ./usr/include/X11/extensions/xf86dgaproto.h \
    ./usr/include/X11/extensions/xf86dgastr.h \
    ./usr/include/X11/extensions/xf86vm.h \
    ./usr/include/X11/extensions/xf86vmproto.h \
    ./usr/include/X11/extensions/xf86vmstr.h \
    ./usr/include/X11/extensions/xfixesproto.h \
    ./usr/include/X11/extensions/xfixeswire.h \
    ./usr/include/X11/extensions/xtestconst.h \
    ./usr/include/X11/extensions/xtestext1const.h \
    ./usr/include/X11/extensions/xtestext1proto.h \
    ./usr/include/X11/extensions/xtestproto.h \
    ./usr/include/X11/fonts/FS.h \
    ./usr/include/X11/fonts/FSproto.h \
    ./usr/include/X11/fonts/font.h \
    ./usr/include/X11/fonts/fontproto.h \
    ./usr/include/X11/fonts/fontstruct.h \
    ./usr/include/X11/fonts/fsmasks.h \
    ./usr/include/X11/keysym.h \
    ./usr/include/X11/keysymdef.h \
    ./usr/share/doc/x11proto-dev/PM_spec.gz \
    ./usr/share/doc/x11proto-dev/changelog.Debian.gz \
    ./usr/share/doc/x11proto-dev/compositeproto.txt.gz \
    ./usr/share/doc/x11proto-dev/copyright \
    ./usr/share/doc/x11proto-dev/damageproto.txt.gz \
    ./usr/share/doc/x11proto-dev/dri2proto.txt.gz \
    ./usr/share/doc/x11proto-dev/dri3proto.txt.gz \
    ./usr/share/doc/x11proto-dev/fixesproto.txt.gz \
    ./usr/share/doc/x11proto-dev/presentproto.txt.gz \
    ./usr/share/doc/x11proto-dev/randrproto.txt.gz \
    ./usr/share/doc/x11proto-dev/renderproto.txt.gz \
    ./usr/share/doc/x11proto-dev/resproto.txt.gz \
    ./usr/share/doc/x11proto-dev/xv-protocol-v2.txt.gz \
    ./usr/share/pkgconfig/applewmproto.pc \
    ./usr/share/pkgconfig/bigreqsproto.pc \
    ./usr/share/pkgconfig/compositeproto.pc \
    ./usr/share/pkgconfig/damageproto.pc \
    ./usr/share/pkgconfig/dmxproto.pc \
    ./usr/share/pkgconfig/dri2proto.pc \
    ./usr/share/pkgconfig/dri3proto.pc \
    ./usr/share/pkgconfig/fixesproto.pc \
    ./usr/share/pkgconfig/fontsproto.pc \
    ./usr/share/pkgconfig/glproto.pc \
    ./usr/share/pkgconfig/inputproto.pc \
    ./usr/share/pkgconfig/kbproto.pc \
    ./usr/share/pkgconfig/presentproto.pc \
    ./usr/share/pkgconfig/randrproto.pc \
    ./usr/share/pkgconfig/recordproto.pc \
    ./usr/share/pkgconfig/renderproto.pc \
    ./usr/share/pkgconfig/resourceproto.pc \
    ./usr/share/pkgconfig/scrnsaverproto.pc \
    ./usr/share/pkgconfig/videoproto.pc \
    ./usr/share/pkgconfig/windowswmproto.pc \
    ./usr/share/pkgconfig/xcmiscproto.pc \
    ./usr/share/pkgconfig/xextproto.pc \
    ./usr/share/pkgconfig/xf86bigfontproto.pc \
    ./usr/share/pkgconfig/xf86dgaproto.pc \
    ./usr/share/pkgconfig/xf86driproto.pc \
    ./usr/share/pkgconfig/xf86vidmodeproto.pc \
    ./usr/share/pkgconfig/xineramaproto.pc \
    ./usr/share/pkgconfig/xproto.pc\
"
FILES_x11proto-input-dev = " \
    ./usr/share/doc/x11proto-input-dev/changelog.Debian.gz \
    ./usr/share/doc/x11proto-input-dev/copyright\
"
FILES_x11proto-kb-dev = " \
    ./usr/share/doc/x11proto-kb-dev/changelog.Debian.gz \
    ./usr/share/doc/x11proto-kb-dev/copyright\
"
