PACKAGES = "${PN} libp11-kit0"
PROVIDES = "libp11-kit0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/p11-kit/libp11-kit0_0.23.15-2+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libp11-kit0 = "libp11-kit0_0.23.15-2+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "60b33c5f8394690ed7079179f461330873285337e4b9c315216b66414130ff18"
SRC_URI[deb0.md5sum] = "ded811b08e8d93f6ce2a1d745913233a"

RDEPENDS_lib${PN}0 = "libc6 (>= 2.28) libffi6 (>= 3.0.4)"
DEPENDS = "libc6 libffi6"


inherit deb_group

FILES_libp11-kit0 = " \
    ./usr/lib/arm-linux-gnueabihf/libp11-kit.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libp11-kit.so.0.3.0 \
    ./usr/share/doc/libp11-kit0/changelog.Debian.gz \
    ./usr/share/doc/libp11-kit0/changelog.gz \
    ./usr/share/doc/libp11-kit0/copyright \
    ./usr/share/doc/libp11-kit0/examples/pkcs11.conf.example\
"
