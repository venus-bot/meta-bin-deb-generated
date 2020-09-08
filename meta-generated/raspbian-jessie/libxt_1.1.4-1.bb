PACKAGES = "${PN} libxt6"
PROVIDES = "libxt6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxt/libxt6_1.1.4-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxt6 = "libxt6_1.1.4-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "bec72ed70fee121941ed55fbdbdf8f9f5e3598adf21e01ebf64914f715f5e7d6"
SRC_URI[deb0.md5sum] = "a6e46d6c4bdc21702db89add4c7817ba"

RDEPENDS_${PN}6 = "libc6 (>= 2.7) libice6 (>= 1:1.0.0) libsm6 libx11-6 multiarch-support"
DEPENDS = "libc6 libice6 libsm6 libx11-6 multiarch-support"


inherit deb_group

FILES_libxt6 = " \
    ./usr/lib/arm-linux-gnueabihf/libXt.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libXt.so.6.0.0 \
    ./usr/share/doc/libxt6/changelog.Debian.gz \
    ./usr/share/doc/libxt6/changelog.gz \
    ./usr/share/doc/libxt6/copyright\
"
