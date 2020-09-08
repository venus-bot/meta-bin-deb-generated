PACKAGES = "${PN} x11proto-kb-dev"
PROVIDES = "x11proto-kb-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/x/x11proto-kb/x11proto-kb-dev_1.0.6-2_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_x11proto-kb-dev = "x11proto-kb-dev_1.0.6-2_all.deb"
SRC_URI[deb0.sha256sum] = "b7ff8eceb9f05eb470700807c73fdae88f5f9f8b8fbef869029882264dbebd81"
SRC_URI[deb0.md5sum] = "892865f3dc1b65a8a5c84413c2ce424b"

RDEPENDS_${PN}-dev = ""

inherit deb_group

FILES_${PN}-dev = " \
    ./usr/include/X11/extensions/XKB.h \
    ./usr/include/X11/extensions/XKBgeom.h \
    ./usr/include/X11/extensions/XKBproto.h \
    ./usr/include/X11/extensions/XKBsrv.h \
    ./usr/include/X11/extensions/XKBstr.h \
    ./usr/share/doc/x11proto-kb-dev/XKBproto-1.svg \
    ./usr/share/doc/x11proto-kb-dev/XKBproto-10.svg \
    ./usr/share/doc/x11proto-kb-dev/XKBproto-11.svg \
    ./usr/share/doc/x11proto-kb-dev/XKBproto-2.svg \
    ./usr/share/doc/x11proto-kb-dev/XKBproto-3.svg \
    ./usr/share/doc/x11proto-kb-dev/XKBproto-4.svg \
    ./usr/share/doc/x11proto-kb-dev/XKBproto-5.svg \
    ./usr/share/doc/x11proto-kb-dev/XKBproto-6.svg \
    ./usr/share/doc/x11proto-kb-dev/XKBproto-7.svg \
    ./usr/share/doc/x11proto-kb-dev/XKBproto-8.svg \
    ./usr/share/doc/x11proto-kb-dev/XKBproto-9.svg \
    ./usr/share/doc/x11proto-kb-dev/changelog.Debian.gz \
    ./usr/share/doc/x11proto-kb-dev/copyright \
    ./usr/share/doc/x11proto-kb-dev/xkbproto.html \
    ./usr/share/doc/x11proto-kb-dev/xkbproto.txt.gz \
    ./usr/share/pkgconfig/kbproto.pc\
"
