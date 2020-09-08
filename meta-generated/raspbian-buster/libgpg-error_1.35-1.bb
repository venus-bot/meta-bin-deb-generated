PACKAGES = "${PN} libgpg-error0"
PROVIDES = "libgpg-error0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libg/libgpg-error/libgpg-error0_1.35-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgpg-error0 = "libgpg-error0_1.35-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "6549092b313862bf3959fa4a0903a885ff81a777bed2b4925ab85df03588eee2"
SRC_URI[deb0.md5sum] = "618b5f228d116b5d1d2fc9e9f5bf931f"

RDEPENDS_${PN}0 = "libc6 (>= 2.28)"
DEPENDS = "libc6"


inherit deb_group

FILES_libgpg-error0 = " \
    ./lib/arm-linux-gnueabihf/libgpg-error.so.0 \
    ./lib/arm-linux-gnueabihf/libgpg-error.so.0.26.1 \
    ./usr/share/doc/libgpg-error0/README.gz \
    ./usr/share/doc/libgpg-error0/changelog.Debian.gz \
    ./usr/share/doc/libgpg-error0/changelog.gz \
    ./usr/share/doc/libgpg-error0/copyright\
"
