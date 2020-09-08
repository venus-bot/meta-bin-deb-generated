PACKAGES = "${PN} libpng16-16"
PROVIDES = "libpng16-16"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libp/libpng1.6/libpng16-16_1.6.36-6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpng16-16 = "libpng16-16_1.6.36-6_armhf.deb"
SRC_URI[deb0.sha256sum] = "e5d547ed5bcc30045e8812602324c41a8e59536bed73d2af0405cbe3b596eb44"
SRC_URI[deb0.md5sum] = "9ddedb8c712114215cd140d7c28db12d"

RDEPENDS_libpng16-16 = "libc6 (>= 2.11) zlib1g (>= 1:1.2.11.dfsg)"
DEPENDS = "libc6 zlib1g"


inherit deb_group

FILES_libpng16-16 = " \
    ./usr/lib/arm-linux-gnueabihf/libpng16.so.16 \
    ./usr/lib/arm-linux-gnueabihf/libpng16.so.16.36.0 \
    ./usr/share/doc-base/libpng16 \
    ./usr/share/doc/libpng16-16/ANNOUNCE \
    ./usr/share/doc/libpng16-16/README.gz \
    ./usr/share/doc/libpng16-16/TODO \
    ./usr/share/doc/libpng16-16/changelog.Debian.gz \
    ./usr/share/doc/libpng16-16/changelog.gz \
    ./usr/share/doc/libpng16-16/copyright \
    ./usr/share/doc/libpng16-16/libpng-manual.txt.gz\
"
