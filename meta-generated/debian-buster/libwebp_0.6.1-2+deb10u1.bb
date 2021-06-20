PACKAGES = "${PN} libwebp6"
PROVIDES = "libwebp6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libw/libwebp/libwebp6_0.6.1-2+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libwebp6 = "libwebp6_0.6.1-2+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "0017881e22cc485478ba8ede9d59720b9f0dcfa6a436f87021553987199cafae"
SRC_URI[deb0.md5sum] = "e292c4f9baba440b40080001b832f795"

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
