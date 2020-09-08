PACKAGES = "${PN} libbsd0"
PROVIDES = "libbsd0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libb/libbsd/libbsd0_0.9.1-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libbsd0 = "libbsd0_0.9.1-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "59f25ad5e2e98180bf73ec787230e9fa329b7baf2e98288945ac43c5918f4bea"
SRC_URI[deb0.md5sum] = "51c211478250fa95dc4c46944b104382"

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
