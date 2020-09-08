PACKAGES = "${PN} libp11-kit0"
PROVIDES = "libp11-kit0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/p11-kit/libp11-kit0_0.20.7-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libp11-kit0 = "libp11-kit0_0.20.7-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "70b3358352e793bc0e78cde9d8edd2e9c89ae3ec29b664c639544ac8bd6d984d"
SRC_URI[deb0.md5sum] = "3e10fe21789f145b492178eb80e6d07c"

RDEPENDS_lib${PN}0 = "libc6 (>= 2.16) libffi6 (>= 3.0.4) multiarch-support"
DEPENDS = "libc6 libffi6 multiarch-support"


inherit deb_group

FILES_libp11-kit0 = " \
    ./usr/lib/arm-linux-gnueabihf/libp11-kit.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libp11-kit.so.0.0.0 \
    ./usr/share/doc/libp11-kit0/changelog.Debian.gz \
    ./usr/share/doc/libp11-kit0/changelog.gz \
    ./usr/share/doc/libp11-kit0/copyright \
    ./usr/share/doc/libp11-kit0/examples/pkcs11.conf.example\
"
