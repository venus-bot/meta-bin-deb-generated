PACKAGES = "${PN} libev4"
PROVIDES = "libev4"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libe/libev/libev4_4.25-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libev4 = "libev4_4.25-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "75d968b192f5d23a40d4bd46e95ef6274fdd0efc307bee9f9d15b47497a7659c"
SRC_URI[deb0.md5sum] = "7d99acb0af545ae700aaee6ab386d662"

RDEPENDS_${PN}4 = "libc6 (>= 2.28)"
DEPENDS = "libc6"


inherit deb_group

FILES_libev4 = " \
    ./usr/lib/arm-linux-gnueabihf/libev.so.4 \
    ./usr/lib/arm-linux-gnueabihf/libev.so.4.0.0 \
    ./usr/share/doc/libev4/changelog.Debian.gz \
    ./usr/share/doc/libev4/changelog.gz \
    ./usr/share/doc/libev4/copyright\
"
