PACKAGES = "${PN} libmng1"
PROVIDES = "libmng1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libm/libmng/libmng1_1.0.10+dfsg-3.1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libmng1 = "libmng1_1.0.10+dfsg-3.1_armhf.deb"
SRC_URI[deb0.sha256sum] = "0e3767c91c4adf54c7870e65ac668f6ad09b927ad1b9f89ca2fd78517e359573"
SRC_URI[deb0.md5sum] = "6d2c15e516d794647f7d648e6d5b70ce"

RDEPENDS_${PN}1 = "libc6 (>= 2.4) libjpeg8 (>= 8c) liblcms2-2 (>= 2.2+git20110628) multiarch-support zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 libjpeg8 liblcms2-2 multiarch-support zlib1g"


inherit deb_group

FILES_libmng1 = " \
    ./usr/lib/arm-linux-gnueabihf/libmng.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libmng.so.1.1.0.10 \
    ./usr/share/doc/libmng1/README \
    ./usr/share/doc/libmng1/changelog.Debian.gz \
    ./usr/share/doc/libmng1/changelog.gz \
    ./usr/share/doc/libmng1/copyright\
"
