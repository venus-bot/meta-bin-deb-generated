PACKAGES = "${PN} libbz2-1.0"
PROVIDES = "libbz2-1.0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/b/bzip2/libbz2-1.0_1.0.6-9.2~deb10u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libbz2-1.0 = "libbz2-1.0_1.0.6-9.2~deb10u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "3e9c74fe10e8b006167b1a91293d16955a4bb79ba28791bd58c3466808e9aff4"
SRC_URI[deb0.md5sum] = "fdb4f995e9dd6229b49776f151204faa"

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
