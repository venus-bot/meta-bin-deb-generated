PACKAGES = "${PN} libuuid1 uuid-dev"
PROVIDES = "libuuid1 uuid-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/u/util-linux/libuuid1_2.25.2-6_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/u/util-linux/uuid-dev_2.25.2-6_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libuuid1 = "libuuid1_2.25.2-6_armhf.deb"
SRC_URI[deb0.sha256sum] = "4be8cf50bd690b1da8320c0718cca171f140f637f623f88263a91dc2eb6ceeea"
SRC_URI[deb0.md5sum] = "a0dd160ab0f75782aff2b3dc76ceed89"
DEBFILENAME_uuid-dev = "uuid-dev_2.25.2-6_armhf.deb"
SRC_URI[deb1.sha256sum] = "2ec3e04410212419430da8fe07f8d399aafa30f255a7d6a9988072e40952621e"
SRC_URI[deb1.md5sum] = "c8f3a3dbca2e939c66a4f0756b51a599"

RDEPENDS_libuuid1 = "libc6 (>= 2.4) multiarch-support passwd"
RDEPENDS_uuid-dev = "libc6-dev libuuid1 (= 2.25.2-6)"
DEPENDS = "libc6 libc6-dev multiarch-support passwd"


inherit deb_group

FILES_libuuid1 = " \
    ./lib/arm-linux-gnueabihf/libuuid.so.1 \
    ./lib/arm-linux-gnueabihf/libuuid.so.1.3.0 \
    ./usr/share/doc/libuuid1/changelog.Debian.gz \
    ./usr/share/doc/libuuid1/changelog.gz \
    ./usr/share/doc/libuuid1/copyright\
"
FILES_uuid-dev = " \
    ./usr/include/uuid/uuid.h \
    ./usr/lib/arm-linux-gnueabihf/libuuid.a \
    ./usr/lib/arm-linux-gnueabihf/libuuid.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/uuid.pc \
    ./usr/share/doc/uuid-dev/changelog.Debian.gz \
    ./usr/share/doc/uuid-dev/changelog.gz \
    ./usr/share/doc/uuid-dev/copyright \
    ./usr/share/man/man3/uuid.3.gz \
    ./usr/share/man/man3/uuid_clear.3.gz \
    ./usr/share/man/man3/uuid_compare.3.gz \
    ./usr/share/man/man3/uuid_copy.3.gz \
    ./usr/share/man/man3/uuid_generate.3.gz \
    ./usr/share/man/man3/uuid_generate_random.3.gz \
    ./usr/share/man/man3/uuid_generate_time.3.gz \
    ./usr/share/man/man3/uuid_generate_time_safe.3.gz \
    ./usr/share/man/man3/uuid_is_null.3.gz \
    ./usr/share/man/man3/uuid_parse.3.gz \
    ./usr/share/man/man3/uuid_time.3.gz \
    ./usr/share/man/man3/uuid_unparse.3.gz\
"
