PACKAGES = "${PN} libmng1"
PROVIDES = "libmng1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libm/libmng/libmng1_1.0.10+dfsg-3.1+b3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libmng1 = "libmng1_1.0.10+dfsg-3.1+b3_armhf.deb"
SRC_URI[deb0.sha256sum] = "a8e7e61fb3b31fbb321cee64ad8bf28ea86539a955af82449ff99bd551dab4b6"
SRC_URI[deb0.md5sum] = "1b7fc957eeb8c72423cdbf8db11dc1e7"

RDEPENDS_${PN}1 = "libc6 (>= 2.4) libjpeg62-turbo (>= 1.3.1) liblcms2-2 (>= 2.2+git20110628) zlib1g (>= 1:1.1.4)"
DEPENDS = "libjpeg62-turbo zlib1g libc6 liblcms2-2"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libmng1 = " \
    ./usr/lib/arm-linux-gnueabihf/libmng.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libmng.so.1.1.0.10 \
    ./usr/share/doc/libmng1/README \
    ./usr/share/doc/libmng1/changelog.Debian.armhf.gz \
    ./usr/share/doc/libmng1/changelog.Debian.gz \
    ./usr/share/doc/libmng1/changelog.gz \
    ./usr/share/doc/libmng1/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
