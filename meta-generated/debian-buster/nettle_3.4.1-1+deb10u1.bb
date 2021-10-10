PACKAGES = "${PN} libhogweed4 libnettle6"
PROVIDES = "libhogweed4 libnettle6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/n/nettle/libhogweed4_3.4.1-1+deb10u1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/n/nettle/libnettle6_3.4.1-1+deb10u1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libhogweed4 = "libhogweed4_3.4.1-1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "94d9044004f9d322a36d8bb53f4b5deb679036f0ee5731eaa7bf36e17cdc1df3"
SRC_URI[deb0.md5sum] = "39642598d45006cbdda3f0a48033fed1"
DEBFILENAME_libnettle6 = "libnettle6_3.4.1-1+deb10u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "b56a8200998d64a4f4f56816d3748fe20445ba7e66aa0ba5fd8134b8df767f0a"
SRC_URI[deb1.md5sum] = "a87d3d395b200643adc20a7506ade707"

RDEPENDS_libhogweed4 = "libc6 (>= 2.4) libgmp10 (>= 2:6.0.0) libnettle6 (= 3.4.1-1+deb10u1)"
RDEPENDS_lib${PN}6 = "libc6 (>= 2.4)"
DEPENDS = "libc6 libgmp10"


inherit deb_group

FILES_libhogweed4 = " \
    ./usr/lib/arm-linux-gnueabihf/libhogweed.so.4 \
    ./usr/lib/arm-linux-gnueabihf/libhogweed.so.4.5 \
    ./usr/share/doc/libhogweed4\
"
FILES_libnettle6 = " \
    ./usr/lib/arm-linux-gnueabihf/libnettle.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libnettle.so.6.5 \
    ./usr/share/doc/libnettle6/NEWS.gz \
    ./usr/share/doc/libnettle6/README \
    ./usr/share/doc/libnettle6/changelog.Debian.gz \
    ./usr/share/doc/libnettle6/changelog.gz \
    ./usr/share/doc/libnettle6/copyright\
"
