PACKAGES = "${PN} libcap-ng0"
PROVIDES = "libcap-ng0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libc/libcap-ng/libcap-ng0_0.7.4-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libcap-ng0 = "libcap-ng0_0.7.4-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "632bc3862ee1c17d3a52e05cb2070fb794103fbe4e07a000c022306bbae5ba29"
SRC_URI[deb0.md5sum] = "174157905ac0d248d464fc87204ceef4"

RDEPENDS_${PN}0 = "libc6 (>= 2.8) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_libcap-ng0 = " \
    ./usr/lib/arm-linux-gnueabihf/libcap-ng.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libcap-ng.so.0.0.0 \
    ./usr/share/doc/libcap-ng0/changelog.Debian.gz \
    ./usr/share/doc/libcap-ng0/changelog.gz \
    ./usr/share/doc/libcap-ng0/copyright\
"
