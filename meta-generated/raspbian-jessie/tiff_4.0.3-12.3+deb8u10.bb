PACKAGES = "${PN} libtiff5"
PROVIDES = "libtiff5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/t/tiff/libtiff5_4.0.3-12.3+deb8u10_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libtiff5 = "libtiff5_4.0.3-12.3+deb8u10_armhf.deb"
SRC_URI[deb0.sha256sum] = "a0ec504b04d1750a4dc3d22c0d8b01f9e291fe2473a8c3457db48065de2c7006"
SRC_URI[deb0.md5sum] = "0065573c8019bee2cc3aab914d720165"

RDEPENDS_lib${PN}5 = "libc6 (>= 2.11) libjbig0 (>= 2.0) libjpeg62-turbo (>= 1.3.1) liblzma5 (>= 5.1.1alpha+20120614) multiarch-support zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 libjbig0 libjpeg62-turbo liblzma5 multiarch-support zlib1g"


inherit deb_group

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
