PACKAGES = "${PN} libxt6"
PROVIDES = "libxt6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libx/libxt/libxt6_1.1.5-1+b3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxt6 = "libxt6_1.1.5-1+b3_armhf.deb"
SRC_URI[deb0.sha256sum] = "3f644b801d3775f981ccd28091ca25614c3d6614bc15371bcb884cc91e34e432"
SRC_URI[deb0.md5sum] = "e35352eadbdc345c39b703b06346707f"

RDEPENDS_${PN}6 = "libc6 (>= 2.7) libice6 (>= 1:1.0.0) libsm6 libx11-6"
DEPENDS = "libc6 libice6 libsm6 libx11-6"


inherit deb_group

FILES_libxt6 = " \
    ./usr/lib/arm-linux-gnueabihf/libXt.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libXt.so.6.0.0 \
    ./usr/share/doc/libxt6/changelog.Debian.armhf.gz \
    ./usr/share/doc/libxt6/changelog.Debian.gz \
    ./usr/share/doc/libxt6/changelog.gz \
    ./usr/share/doc/libxt6/copyright\
"
