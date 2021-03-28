PACKAGES = "${PN} libbsd0"
PROVIDES = "libbsd0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libb/libbsd/libbsd0_0.9.1-2+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libbsd0 = "libbsd0_0.9.1-2+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "09ac6fe3ce7b868ce2ae815f807086aa144d1a5edf354099644248de303a0bd9"
SRC_URI[deb0.md5sum] = "3e36ae2ffeeb509b6d242a757b2e0752"

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
