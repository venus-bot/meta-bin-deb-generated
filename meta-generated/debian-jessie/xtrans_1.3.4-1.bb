PACKAGES = "${PN} xtrans-dev"
PROVIDES = "xtrans-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/x/xtrans/xtrans-dev_1.3.4-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_xtrans-dev = "xtrans-dev_1.3.4-1_all.deb"
SRC_URI[deb0.sha256sum] = "c4e0b9534370762410efdaaa7375c97c95b77c60ec1502448dd549625d192786"
SRC_URI[deb0.md5sum] = "b6fd34de002a58c761dfc777c86fab53"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN}-dev = " \
    ./usr/share/doc/xtrans-dev/xtrans.txt.gz \
    ./usr/include/X11/Xtrans/Xtransutil.c \
    ./usr/share/doc/xtrans-dev/copyright \
    ./usr/share/doc/xtrans-dev/README \
    ./usr/include/X11/Xtrans/Xtranslcl.c \
    ./usr/share/doc/xtrans-dev/xtrans.html \
    ./usr/share/aclocal/xtrans.m4 \
    ./usr/include/X11/Xtrans/Xtransint.h \
    ./usr/share/doc/xtrans-dev/changelog.Debian.gz \
    ./usr/share/doc/xtrans-dev/xtrans.xml.gz \
    ./usr/share/doc/xtrans-dev/xtrans.html.db \
    ./usr/share/pkgconfig/xtrans.pc \
    ./usr/share/doc/xtrans-dev/xtrans.pdf.db.gz \
    ./usr/include/X11/Xtrans/Xtranssock.c \
    ./usr/share/doc/xtrans-dev/changelog.gz \
    ./usr/include/X11/Xtrans/Xtrans.h \
    ./usr/include/X11/Xtrans/transport.c \
    ./usr/include/X11/Xtrans/Xtrans.c\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
