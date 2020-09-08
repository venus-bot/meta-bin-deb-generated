PACKAGES = "${PN} xtrans-dev"
PROVIDES = "xtrans-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/x/xtrans/xtrans-dev_1.3.5-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_xtrans-dev = "xtrans-dev_1.3.5-1_all.deb"
SRC_URI[deb0.sha256sum] = "cadb720a2f8f0a2b2ad2dd82172d59e105e37885cedb3a93f6de9c78478c72d0"
SRC_URI[deb0.md5sum] = "b5457e654b87351d6bbbb049f28f87c2"

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
