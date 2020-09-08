PACKAGES = "${PN} libwebp6"
PROVIDES = "libwebp6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libw/libwebp/libwebp6_0.6.1-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libwebp6 = "libwebp6_0.6.1-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "e90d97c8a4ae0390468c4e652c9739b6c522a7d11054279893f43d3ee70e6097"
SRC_URI[deb0.md5sum] = "5c48a65739c76b4da20ad1e67e80c5cc"

RDEPENDS_${PN}6 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_libwebp6 = " \
    ./usr/lib/arm-linux-gnueabihf/libwebp.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libwebp.so.6.0.2 \
    ./usr/share/doc/libwebp6/changelog.Debian.gz \
    ./usr/share/doc/libwebp6/changelog.gz \
    ./usr/share/doc/libwebp6/copyright\
"
