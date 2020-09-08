PACKAGES = "${PN} libjbig0"
PROVIDES = "libjbig0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/j/jbigkit/libjbig0_2.1-3.1+b2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libjbig0 = "libjbig0_2.1-3.1+b2_armhf.deb"
SRC_URI[deb0.sha256sum] = "5f18fbc3619ecc0815a31d6ecda5edc6b63e6cc09ae4ed43629c57638acca0d8"
SRC_URI[deb0.md5sum] = "08d698008526dd7e2754fa27c582f020"

RDEPENDS_libjbig0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_libjbig0 = " \
    ./usr/lib/arm-linux-gnueabihf/libjbig.so.0 \
    ./usr/share/doc/libjbig0/changelog.Debian.armhf.gz \
    ./usr/share/doc/libjbig0/changelog.Debian.gz \
    ./usr/share/doc/libjbig0/changelog.gz \
    ./usr/share/doc/libjbig0/copyright\
"
