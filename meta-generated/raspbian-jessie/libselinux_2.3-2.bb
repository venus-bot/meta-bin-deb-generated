PACKAGES = "${PN} libselinux1"
PROVIDES = "libselinux1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libs/libselinux/libselinux1_2.3-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libselinux1 = "libselinux1_2.3-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "506f2eafcb5945d1c008cb3f6a8f6d37e3ccca7a1541610793ae55bf5debce36"
SRC_URI[deb0.md5sum] = "af5ffa0ba3ad7c1e23c965b92fef56da"

RDEPENDS_${PN}1 = "libc6 (>= 2.8) libpcre3 (>= 8.10) multiarch-support"
DEPENDS = "libc6 libpcre3 multiarch-support"


inherit deb_group

FILES_libselinux1 = " \
    ./lib/arm-linux-gnueabihf/libselinux.so.1 \
    ./usr/share/doc/libselinux1/changelog.Debian.gz \
    ./usr/share/doc/libselinux1/changelog.gz \
    ./usr/share/doc/libselinux1/copyright\
"
