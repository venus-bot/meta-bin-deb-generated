PACKAGES = "${PN} libhogweed4 libnettle6"
PROVIDES = "libhogweed4 libnettle6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/n/nettle/libhogweed4_3.4.1-1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/n/nettle/libnettle6_3.4.1-1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libhogweed4 = "libhogweed4_3.4.1-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "86a3eece9eec59f3580153b6a0fabfc1ce940341b00c380bf1fe5cbc4702af1f"
SRC_URI[deb0.md5sum] = "abbf810a34e6a1d004456207d3187f69"
DEBFILENAME_libnettle6 = "libnettle6_3.4.1-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "33a1a1699d29bc3c1587dc81a86f36d31e844176c0f736d9682ff0f4cea5abdb"
SRC_URI[deb1.md5sum] = "1b5e553872905af678d9318d9a40935e"

RDEPENDS_libhogweed4 = "libc6 (>= 2.4) libgmp10 (>= 2:6.0.0) libnettle6 (= 3.4.1-1)"
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
