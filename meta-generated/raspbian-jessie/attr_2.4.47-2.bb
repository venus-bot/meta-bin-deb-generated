PACKAGES = "${PN} libattr1"
PROVIDES = "libattr1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/a/attr/libattr1_2.4.47-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libattr1 = "libattr1_2.4.47-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "8dbffa316aa324705467921751d786d04c57dc3df306c65a3b8b2ee8ae24371c"
SRC_URI[deb0.md5sum] = "3ad7d07cda207acaa685444d5ca6ded2"

RDEPENDS_lib${PN}1 = "libc6 (>= 2.4) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_libattr1 = " \
    ./lib/arm-linux-gnueabihf/libattr.so.1 \
    ./lib/arm-linux-gnueabihf/libattr.so.1.1.0 \
    ./usr/share/doc/libattr1/changelog.Debian.gz \
    ./usr/share/doc/libattr1/changelog.gz \
    ./usr/share/doc/libattr1/copyright\
"
