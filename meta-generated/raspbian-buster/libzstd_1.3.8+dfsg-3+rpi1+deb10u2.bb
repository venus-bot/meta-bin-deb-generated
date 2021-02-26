PACKAGES = "${PN} libzstd1"
PROVIDES = "libzstd1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libz/libzstd/libzstd1_1.3.8+dfsg-3+rpi1+deb10u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libzstd1 = "libzstd1_1.3.8+dfsg-3+rpi1+deb10u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "2b5cca605248cd8c0470182690cbe8f2960240b23277494fe17f1005a6c27c1d"
SRC_URI[deb0.md5sum] = "5432034add1ef2089a94d495d5a9b27b"

RDEPENDS_${PN}1 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_libzstd1 = " \
    ./usr/lib/arm-linux-gnueabihf/libzstd.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libzstd.so.1.3.8 \
    ./usr/share/doc/libzstd1/changelog.Debian.gz \
    ./usr/share/doc/libzstd1/changelog.gz \
    ./usr/share/doc/libzstd1/copyright\
"
