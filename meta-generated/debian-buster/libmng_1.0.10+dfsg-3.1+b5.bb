PACKAGES = "${PN} libmng1"
PROVIDES = "libmng1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libm/libmng/libmng1_1.0.10+dfsg-3.1+b5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libmng1 = "libmng1_1.0.10+dfsg-3.1+b5_armhf.deb"
SRC_URI[deb0.sha256sum] = "e71b150854fbe7ed8832df060b2b65b0cbf0cbb5f6b41a1391c0cee99d8797a8"
SRC_URI[deb0.md5sum] = "91a5cdf1574729b390ff88a7c6487f62"

RDEPENDS_${PN}1 = "libc6 (>= 2.4) libjpeg62-turbo (>= 1.3.1) liblcms2-2 (>= 2.2+git20110628) zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 libjpeg62-turbo liblcms2-2 zlib1g"


inherit deb_group

FILES_libmng1 = " \
    ./usr/lib/arm-linux-gnueabihf/libmng.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libmng.so.1.1.0.10 \
    ./usr/share/doc/libmng1/README \
    ./usr/share/doc/libmng1/changelog.Debian.armhf.gz \
    ./usr/share/doc/libmng1/changelog.Debian.gz \
    ./usr/share/doc/libmng1/changelog.gz \
    ./usr/share/doc/libmng1/copyright\
"
