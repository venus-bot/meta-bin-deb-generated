PACKAGES = "${PN} libzstd1"
PROVIDES = "libzstd1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libz/libzstd/libzstd1_1.3.8+dfsg-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libzstd1 = "libzstd1_1.3.8+dfsg-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "0d67cba006a2b1e8def28ec30a7f31ff3505b3b65297091f6eca69ac3bbb7cb4"
SRC_URI[deb0.md5sum] = "bdc4c35b357073dc392d8ceae8a0ccf5"

RDEPENDS_${PN}1 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_libzstd1 = " \
    ./usr/lib/arm-linux-gnueabihf/libzstd.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libzstd.so.1.3.8 \
    ./usr/share/doc/libzstd1/changelog.Debian.gz \
    ./usr/share/doc/libzstd1/changelog.gz \
    ./usr/share/doc/libzstd1/copyright\
"
