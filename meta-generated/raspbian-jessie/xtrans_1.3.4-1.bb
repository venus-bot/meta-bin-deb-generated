PACKAGES = "${PN} xtrans-dev"
PROVIDES = "xtrans-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/x/xtrans/xtrans-dev_1.3.4-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_xtrans-dev = "xtrans-dev_1.3.4-1_all.deb"
SRC_URI[deb0.sha256sum] = "c4e0b9534370762410efdaaa7375c97c95b77c60ec1502448dd549625d192786"
SRC_URI[deb0.md5sum] = "b6fd34de002a58c761dfc777c86fab53"

RDEPENDS_${PN}-dev = ""

inherit deb_group

FILES_${PN}-dev = " \
    ./usr/include/X11/Xtrans/Xtrans.c \
    ./usr/include/X11/Xtrans/Xtrans.h \
    ./usr/include/X11/Xtrans/Xtransint.h \
    ./usr/include/X11/Xtrans/Xtranslcl.c \
    ./usr/include/X11/Xtrans/Xtranssock.c \
    ./usr/include/X11/Xtrans/Xtransutil.c \
    ./usr/include/X11/Xtrans/transport.c \
    ./usr/share/aclocal/xtrans.m4 \
    ./usr/share/doc/xtrans-dev/README \
    ./usr/share/doc/xtrans-dev/changelog.Debian.gz \
    ./usr/share/doc/xtrans-dev/changelog.gz \
    ./usr/share/doc/xtrans-dev/copyright \
    ./usr/share/doc/xtrans-dev/xtrans.html \
    ./usr/share/doc/xtrans-dev/xtrans.html.db \
    ./usr/share/doc/xtrans-dev/xtrans.pdf.db.gz \
    ./usr/share/doc/xtrans-dev/xtrans.txt.gz \
    ./usr/share/doc/xtrans-dev/xtrans.xml.gz \
    ./usr/share/pkgconfig/xtrans.pc\
"
