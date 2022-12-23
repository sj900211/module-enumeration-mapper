package run.freshr.mappers;

/**
 * 열거형 데이터 반환 객체
 *
 * @author FreshR
 * @apiNote 열거형 데이터를 조회해서 반환할 공통 객체
 * @since 2022. 12. 23. 오후 4:23:59
 */
public class EnumGetter {

  /**
   * 키 문자
   *
   * @apiNote EnumModel 을 상속받아 설정한 키 문자
   * @since 2022. 12. 23. 오후 4:23:59
   */
  String key;
  /**
   * 값 문자
   *
   * @apiNote EnumModel 을 상속받아 설정한 값 문자
   * @since 2022. 12. 23. 오후 4:23:59
   */
  String value;

  /**
   * 생성자
   *
   * @param model 열거형 데이터 모델
   * @apiNote 열거형 데이터 모델의 키와 값으로 반환 객체 생성
   * @author FreshR
   * @since 2022. 12. 23. 오후 4:23:59
   */
  public EnumGetter(final EnumModel model) {
    key = model.getKey();
    value = model.getValue();
  }

  /**
   * 키 조회
   *
   * @return 키 문자
   * @apiNote 열거형 데이터에서 설정한 키 문자를 반환
   * @author FreshR
   * @since 2022. 12. 23. 오후 4:23:59
   */
  public String getKey() {
    return key;
  }

  /**
   * 값 조회
   *
   * @return 값 문자
   * @apiNote 열거형 데이터에서 설정한 값 문자를 반환
   * @author FreshR
   * @since 2022. 12. 23. 오후 4:23:59
   */
  public String getValue() {
    return value;
  }

}
