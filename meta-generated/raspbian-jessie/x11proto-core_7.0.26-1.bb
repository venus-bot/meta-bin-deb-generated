PACKAGES = "${PN} x11proto-core-dev"
PROVIDES = "x11proto-core-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/x/x11proto-core/x11proto-core-dev_7.0.26-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_x11proto-core-dev = "x11proto-core-dev_7.0.26-1_all.deb"
SRC_URI[deb0.sha256sum] = "9d60c962746bf2d1b1eb69e872a57eb21e13b341329ca592fd8eca527bab1df6"
SRC_URI[deb0.md5sum] = "48deb8fd641eb7c5a9a368d53237289a"

RDEPENDS_${PN}-dev = "xorg-sgml-doctools (>= 1:1.5)"
DEPENDS = "xorg-sgml-doctools"


inherit deb_group

FILES_${PN}-dev = " \
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
    ./usr/include/X11/keysym.h \
    ./usr/include/X11/keysymdef.h \
    ./usr/share/doc/x11proto-core-dev/changelog.Debian.gz \
    ./usr/share/doc/x11proto-core-dev/changelog.gz \
    ./usr/share/doc/x11proto-core-dev/copyright \
    ./usr/share/doc/x11proto-core-dev/x11protocol.html \
    ./usr/share/doc/x11proto-core-dev/x11protocol.pdf.gz \
    ./usr/share/doc/x11proto-core-dev/x11protocol.txt.gz \
    ./usr/share/pkgconfig/xproto.pc\
"
