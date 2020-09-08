PACKAGES = "${PN} libice6"
PROVIDES = "libice6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libi/libice/libice6_1.0.9-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libice6 = "libice6_1.0.9-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "92374e7e8076ad0062638c7438c886d0c23000b1a8a9b361a057d0625dc20a65"
SRC_URI[deb0.md5sum] = "aeccd7193a94a2c63d46102b57be5f27"

RDEPENDS_${PN}6 = "libbsd0 (>= 0.2.0) libc6 (>= 2.11) x11-common"
DEPENDS = "libbsd0 libc6 x11-common"


inherit deb_group

FILES_libice6 = " \
    ./usr/lib/arm-linux-gnueabihf/libICE.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libICE.so.6.3.0 \
    ./usr/share/doc/libice6/changelog.Debian.gz \
    ./usr/share/doc/libice6/changelog.gz \
    ./usr/share/doc/libice6/copyright\
"
