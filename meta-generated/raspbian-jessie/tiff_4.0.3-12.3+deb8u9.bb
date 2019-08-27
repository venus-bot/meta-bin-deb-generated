PACKAGES = "${PN} libtiff5"
PROVIDES = "libtiff5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/t/tiff/libtiff5_4.0.3-12.3+deb8u9_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libtiff5 = "libtiff5_4.0.3-12.3+deb8u9_armhf.deb"
SRC_URI[deb0.sha256sum] = "27a49345da4fa9673d9258796358caa1d06caac757de166117bd7d10c3c963f3"
SRC_URI[deb0.md5sum] = "32799a0f088907d1925edf92f43fd15e"

RDEPENDS_lib${PN}5 = "libc6 (>= 2.11) libjbig0 (>= 2.0) libjpeg62-turbo (>= 1.3.1) liblzma5 (>= 5.1.1alpha+20120614) zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 libjbig0 libjpeg62-turbo liblzma5 zlib1g"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libtiff5 = " \
    ./usr/lib/arm-linux-gnueabihf/libtiff.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libtiff.so.5.2.0 \
    ./usr/share/doc/libtiff5/README \
    ./usr/share/doc/libtiff5/README.Debian \
    ./usr/share/doc/libtiff5/TODO \
    ./usr/share/doc/libtiff5/changelog.Debian.gz \
    ./usr/share/doc/libtiff5/changelog.gz \
    ./usr/share/doc/libtiff5/copyright \
    ./usr/share/lintian/overrides/libtiff5\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
