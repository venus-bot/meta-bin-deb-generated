PACKAGES = "${PN} libuuid1 uuid-dev"
PROVIDES = "libuuid1 uuid-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/u/util-linux/libuuid1_2.25.2-6_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/u/util-linux/uuid-dev_2.25.2-6_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libuuid1 = "libuuid1_2.25.2-6_armhf.deb"
SRC_URI[deb0.sha256sum] = "3b21bafc7aee628a716eb01746a62b722a86df202d75b4dd1ef540bfb45c1ac6"
SRC_URI[deb0.md5sum] = "886e4adaa3fafee55d0a8f2fb85079f4"
DEBFILENAME_uuid-dev = "uuid-dev_2.25.2-6_armhf.deb"
SRC_URI[deb1.sha256sum] = "3d59551eabef2ed2dceacc49a7ffbd768fc85698fd4a3731f3b4c57fe55c09eb"
SRC_URI[deb1.md5sum] = "ad5541a258d4a53da97e1f13d27e4f0d"

RDEPENDS_libuuid1 = "passwd libc6 (>= 2.4)"
RDEPENDS_uuid-dev = "libc6-dev libuuid1 (= 2.25.2-6)"
DEPENDS = "libc6 passwd libc6-dev"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libuuid1 = " \
    ./lib/arm-linux-gnueabihf/libuuid.so.1.3.0 \
    ./usr/share/doc/libuuid1/changelog.gz \
    ./usr/share/doc/libuuid1/copyright \
    ./usr/share/doc/libuuid1/changelog.Debian.gz \
    ./lib/arm-linux-gnueabihf/libuuid.so.1\
"
FILES_uuid-dev = " \
    ./usr/share/man/man3/uuid_generate_random.3.gz \
    ./usr/share/man/man3/uuid_generate.3.gz \
    ./usr/share/man/man3/uuid_compare.3.gz \
    ./usr/share/man/man3/uuid_copy.3.gz \
    ./usr/share/man/man3/uuid_clear.3.gz \
    ./usr/share/man/man3/uuid_parse.3.gz \
    ./usr/share/man/man3/uuid.3.gz \
    ./usr/share/doc/uuid-dev/copyright \
    ./usr/share/man/man3/uuid_unparse.3.gz \
    ./usr/share/man/man3/uuid_generate_time_safe.3.gz \
    ./usr/share/man/man3/uuid_generate_time.3.gz \
    ./usr/include/uuid/uuid.h \
    ./usr/lib/arm-linux-gnueabihf/libuuid.so \
    ./usr/share/man/man3/uuid_is_null.3.gz \
    ./usr/share/doc/uuid-dev/changelog.gz \
    ./usr/share/doc/uuid-dev/changelog.Debian.gz \
    ./usr/lib/arm-linux-gnueabihf/libuuid.a \
    ./usr/share/man/man3/uuid_time.3.gz \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/uuid.pc\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
