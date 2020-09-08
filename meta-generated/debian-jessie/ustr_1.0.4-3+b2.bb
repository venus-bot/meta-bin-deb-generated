PACKAGES = "${PN} libustr-1.0-1"
PROVIDES = "libustr-1.0-1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/u/ustr/libustr-1.0-1_1.0.4-3+b2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libustr-1.0-1 = "libustr-1.0-1_1.0.4-3+b2_armhf.deb"
SRC_URI[deb0.sha256sum] = "1082c929e98b7bde21b7715d25642b8e9d89a9d57b6504e042ea568f17ea07ee"
SRC_URI[deb0.md5sum] = "7642d55e19a26bd379c7166e77cfa9e7"

RDEPENDS_lib${PN}-1.0-1 = "libc6 (>= 2.4) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_libustr-1.0-1 = " \
    ./usr/lib/arm-linux-gnueabihf/libustr-1.0.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libustr-1.0.so.1.0.4 \
    ./usr/share/doc/libustr-1.0-1/AUTHORS \
    ./usr/share/doc/libustr-1.0-1/NEWS.gz \
    ./usr/share/doc/libustr-1.0-1/README \
    ./usr/share/doc/libustr-1.0-1/THANKS \
    ./usr/share/doc/libustr-1.0-1/TODO \
    ./usr/share/doc/libustr-1.0-1/changelog.Debian.armhf.gz \
    ./usr/share/doc/libustr-1.0-1/changelog.Debian.gz \
    ./usr/share/doc/libustr-1.0-1/changelog.gz \
    ./usr/share/doc/libustr-1.0-1/copyright\
"
