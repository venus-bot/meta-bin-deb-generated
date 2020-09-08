PACKAGES = "${PN} libsm6"
PROVIDES = "libsm6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libs/libsm/libsm6_1.2.3-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsm6 = "libsm6_1.2.3-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "2c4418aa5a276632d004d1504746c5075ac9aa44f73344d7a5c26e758dc3b04c"
SRC_URI[deb0.md5sum] = "d12080ab832f24afbbad7f74f4290eaf"

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
