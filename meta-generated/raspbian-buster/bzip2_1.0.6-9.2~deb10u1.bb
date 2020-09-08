PACKAGES = "${PN} libbz2-1.0"
PROVIDES = "libbz2-1.0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/b/bzip2/libbz2-1.0_1.0.6-9.2~deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libbz2-1.0 = "libbz2-1.0_1.0.6-9.2~deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "22840e43aa2b48fb0ebe441d7cef8b33380063f722769fe1382574052e214d0e"
SRC_URI[deb0.md5sum] = "648f5dd7f116257818685a0f8594edae"

RDEPENDS_libbz2-1.0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_libbz2-1.0 = " \
    ./lib/arm-linux-gnueabihf/libbz2.so.1 \
    ./lib/arm-linux-gnueabihf/libbz2.so.1.0 \
    ./lib/arm-linux-gnueabihf/libbz2.so.1.0.4 \
    ./usr/share/doc/libbz2-1.0/changelog.Debian.gz \
    ./usr/share/doc/libbz2-1.0/changelog.gz \
    ./usr/share/doc/libbz2-1.0/copyright\
"
