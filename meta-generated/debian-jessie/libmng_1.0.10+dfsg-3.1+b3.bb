PACKAGES = "${PN} libmng1"
PROVIDES = "libmng1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libm/libmng/libmng1_1.0.10+dfsg-3.1+b3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libmng1 = "libmng1_1.0.10+dfsg-3.1+b3_armhf.deb"
SRC_URI[deb0.sha256sum] = "a8e7e61fb3b31fbb321cee64ad8bf28ea86539a955af82449ff99bd551dab4b6"
SRC_URI[deb0.md5sum] = "1b7fc957eeb8c72423cdbf8db11dc1e7"

RDEPENDS_${PN}1 = "libc6 (>= 2.4) libjpeg62-turbo (>= 1.3.1) liblcms2-2 (>= 2.2+git20110628) multiarch-support zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 libjpeg62-turbo liblcms2-2 multiarch-support zlib1g"


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
