PACKAGES = "${PN} libbz2-1.0"
PROVIDES = "libbz2-1.0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/b/bzip2/libbz2-1.0_1.0.6-7+deb8u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libbz2-1.0 = "libbz2-1.0_1.0.6-7+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "d0445338fc349fc2f5691ca931143b40e8c77c64da96f898fce3b18b64f025b1"
SRC_URI[deb0.md5sum] = "62d8ac512c42d12fb5878ef3405af50e"

RDEPENDS_libbz2-1.0 = "libc6 (>= 2.4) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_libbz2-1.0 = " \
    ./lib/arm-linux-gnueabihf/libbz2.so.1 \
    ./lib/arm-linux-gnueabihf/libbz2.so.1.0 \
    ./lib/arm-linux-gnueabihf/libbz2.so.1.0.4 \
    ./usr/share/doc/libbz2-1.0/changelog.Debian.gz \
    ./usr/share/doc/libbz2-1.0/changelog.gz \
    ./usr/share/doc/libbz2-1.0/copyright\
"
