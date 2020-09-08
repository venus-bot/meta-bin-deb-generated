PACKAGES = "${PN} libsm6"
PROVIDES = "libsm6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libs/libsm/libsm6_1.2.3-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsm6 = "libsm6_1.2.3-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "92eccccb771f738c18bec33b38c2bf95a281e216608e91341a7e2dbb1f8703fd"
SRC_URI[deb0.md5sum] = "04aec87103e6a0ee64a18cc952bc404f"

RDEPENDS_${PN}6 = "libc6 (>= 2.4) libice6 (>= 1:1.0.0) libuuid1 (>= 2.16)"
DEPENDS = "libc6 libice6 libuuid1"


inherit deb_group

FILES_libsm6 = " \
    ./usr/lib/arm-linux-gnueabihf/libSM.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libSM.so.6.0.1 \
    ./usr/share/doc/libsm6/changelog.Debian.gz \
    ./usr/share/doc/libsm6/changelog.gz \
    ./usr/share/doc/libsm6/copyright\
"
