PACKAGES = "${PN} libtiff5"
PROVIDES = "libtiff5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/t/tiff/libtiff5_4.1.0+git191117-2~deb10u9_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libtiff5 = "libtiff5_4.1.0+git191117-2~deb10u9_armhf.deb"
SRC_URI[deb0.sha256sum] = "9fd2d79fd95e6da01860da487791df23d94b859207c0db404621830c7469efc3"
SRC_URI[deb0.md5sum] = "800d44b4f1a6fca9ddabf979a8c3dac1"

RDEPENDS_lib${PN}5 = "libc6 (>= 2.11) libjbig0 (>= 2.0) libjpeg62-turbo (>= 1.3.1) liblzma5 (>= 5.1.1alpha+20120614) libwebp6 (>= 0.5.1) libzstd1 (>= 1.3.2) zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 libjbig0 libjpeg62-turbo liblzma5 libwebp6 libzstd1 zlib1g"


inherit deb_group

FILES_libtiff5 = " \
    ./usr/lib/arm-linux-gnueabihf/libtiff.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libtiff.so.5.5.0 \
    ./usr/share/doc/libtiff5/changelog.Debian.gz \
    ./usr/share/doc/libtiff5/changelog.gz \
    ./usr/share/doc/libtiff5/copyright \
    ./usr/share/lintian/overrides/libtiff5\
"
