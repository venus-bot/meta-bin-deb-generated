PACKAGES = "${PN} libcom-err2"
PROVIDES = "libcom-err2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/e/e2fsprogs/libcom-err2_1.44.5-1+deb10u3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libcom-err2 = "libcom-err2_1.44.5-1+deb10u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "9681e00461b693393d7dcc5d095aa4856a0325ed8c1757f138369b2158ccddd1"
SRC_URI[deb0.md5sum] = "95f336570ca4547a00c0c7c5fcc53d11"

RDEPENDS_libcom-err2 = "libc6 (>= 2.28)"
DEPENDS = "libc6"


inherit deb_group

FILES_libcom-err2 = " \
    ./lib/arm-linux-gnueabihf/libcom_err.so.2 \
    ./lib/arm-linux-gnueabihf/libcom_err.so.2.1 \
    ./usr/share/doc/libcom-err2/changelog.Debian.gz \
    ./usr/share/doc/libcom-err2/copyright\
"
