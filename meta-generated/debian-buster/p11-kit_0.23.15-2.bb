PACKAGES = "${PN} libp11-kit0"
PROVIDES = "libp11-kit0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/p11-kit/libp11-kit0_0.23.15-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libp11-kit0 = "libp11-kit0_0.23.15-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "740c2abe75ebfcf6ac14687b36ec3541904a93634dc0f2cc863cd58b7ba5e14d"
SRC_URI[deb0.md5sum] = "056df8a81cccc4d986d0eaae88795d17"

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
