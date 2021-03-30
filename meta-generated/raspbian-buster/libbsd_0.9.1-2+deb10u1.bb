PACKAGES = "${PN} libbsd0"
PROVIDES = "libbsd0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libb/libbsd/libbsd0_0.9.1-2+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libbsd0 = "libbsd0_0.9.1-2+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "074aadec15e61f6bd3f2848f3d393b3f8e0d0b2de75202e9f2e53e3d5a0c2a0d"
SRC_URI[deb0.md5sum] = "0a53e24f2ad120d42129372d2180ed90"

RDEPENDS_${PN}0 = "libc6 (>= 2.25)"
DEPENDS = "libc6"


inherit deb_group

FILES_libbsd0 = " \
    ./usr/lib/arm-linux-gnueabihf/libbsd.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libbsd.so.0.9.1 \
    ./usr/share/doc/libbsd0/changelog.Debian.gz \
    ./usr/share/doc/libbsd0/changelog.gz \
    ./usr/share/doc/libbsd0/copyright\
"
