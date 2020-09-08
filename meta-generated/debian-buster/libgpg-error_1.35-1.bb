PACKAGES = "${PN} libgpg-error0"
PROVIDES = "libgpg-error0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libg/libgpg-error/libgpg-error0_1.35-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgpg-error0 = "libgpg-error0_1.35-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "983661a5a051af598af7b03c4c1e0ba7e69c2fd344904c2a063c03873bfe9939"
SRC_URI[deb0.md5sum] = "489998a1eb62312eac6427882148f7a7"

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
