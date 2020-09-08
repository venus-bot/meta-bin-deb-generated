PACKAGES = "${PN} libbsd0"
PROVIDES = "libbsd0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libb/libbsd/libbsd0_0.7.0-2+deb8u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libbsd0 = "libbsd0_0.7.0-2+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "b34a043df568d9c68a252d33ce15e12a1a969174a821e8c3982b32664d990332"
SRC_URI[deb0.md5sum] = "5ead7ee66a2cdccc36d06de4043252a5"

RDEPENDS_${PN}0 = "libc6 (>= 2.8) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_libbsd0 = " \
    ./lib/arm-linux-gnueabihf/libbsd.so.0 \
    ./lib/arm-linux-gnueabihf/libbsd.so.0.7.0 \
    ./usr/share/doc/libbsd0/changelog.Debian.gz \
    ./usr/share/doc/libbsd0/changelog.gz \
    ./usr/share/doc/libbsd0/copyright\
"
