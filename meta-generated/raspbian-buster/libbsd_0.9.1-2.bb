PACKAGES = "${PN} libbsd0"
PROVIDES = "libbsd0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libb/libbsd/libbsd0_0.9.1-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libbsd0 = "libbsd0_0.9.1-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "49164a38e2aa95b45e154dafa9974765554bad662c6ee865244a1b115d568b94"
SRC_URI[deb0.md5sum] = "9bb3be6da5751aea8d7a84504c08e28e"

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
