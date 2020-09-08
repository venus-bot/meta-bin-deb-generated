PACKAGES = "${PN} libev4"
PROVIDES = "libev4"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libe/libev/libev4_4.25-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libev4 = "libev4_4.25-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "412b04e668cce4e8ef6680f08f45e2135c974ae39777ffe1de6063c25578d97f"
SRC_URI[deb0.md5sum] = "94764a8f2660148b7cb8aebe7debd927"

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
