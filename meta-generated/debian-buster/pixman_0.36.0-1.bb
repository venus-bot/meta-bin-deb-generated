PACKAGES = "${PN} libpixman-1-0"
PROVIDES = "libpixman-1-0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/pixman/libpixman-1-0_0.36.0-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpixman-1-0 = "libpixman-1-0_0.36.0-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "a90a15448a35b75b3c365edb151629e893ece27afa6c585bf11be51fadc216d7"
SRC_URI[deb0.md5sum] = "48ad96ee6ab6530ddeeeb1cafb1dee3b"

RDEPENDS_lib${PN}-1-0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_libpixman-1-0 = " \
    ./usr/lib/arm-linux-gnueabihf/libpixman-1.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libpixman-1.so.0.36.0 \
    ./usr/share/doc/libpixman-1-0/changelog.Debian.gz \
    ./usr/share/doc/libpixman-1-0/changelog.gz \
    ./usr/share/doc/libpixman-1-0/copyright \
    ./usr/share/lintian/overrides/libpixman-1-0\
"
